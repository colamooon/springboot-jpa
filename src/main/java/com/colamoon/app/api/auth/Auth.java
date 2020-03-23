package com.colamoon.app.api.auth;

import com.colamoon.app.api.common.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "member_cola")
public class Auth extends BaseEntity implements UserDetails {

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "auth_id", insertable = false, updatable = false)
    private List<AuthRole> authRoles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authRoles.stream().map(authority -> new SimpleGrantedAuthority(authority.getRole().getRole())).collect(toList());
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return this.password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
