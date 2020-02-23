package com.colamoon.app.api.auth;

import com.colamoon.app.api.common.model.ActiveType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends CrudRepository<Auth, Long> {

    Auth findByUsername(String username);

    Auth findByUsernameAndActive(String username, ActiveType active);

    Auth findByIdAndActive(Long memberId, ActiveType active);
}