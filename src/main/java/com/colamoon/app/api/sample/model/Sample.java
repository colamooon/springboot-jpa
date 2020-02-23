package com.colamoon.app.api.sample.model;

import com.colamoon.app.api.common.model.BaseEntity;
import com.colamoon.app.api.sample.constant.SampleStatus;
import com.colamoon.app.api.common.model.BaseEntity;
import com.colamoon.app.api.sample.constant.SampleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Sample extends BaseEntity {

    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;
    private SampleStatus status = SampleStatus.INIT;


}
