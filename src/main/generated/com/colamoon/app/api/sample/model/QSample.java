package com.colamoon.app.api.sample.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSample is a Querydsl query type for Sample
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSample extends EntityPathBase<Sample> {

    private static final long serialVersionUID = 151945491L;

    public static final QSample sample = new QSample("sample");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    public final StringPath contents = createString("contents");

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<com.colamoon.app.api.sample.constant.SampleStatus> status = createEnum("status", com.colamoon.app.api.sample.constant.SampleStatus.class);

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public QSample(String variable) {
        super(Sample.class, forVariable(variable));
    }

    public QSample(Path<? extends Sample> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSample(PathMetadata metadata) {
        super(Sample.class, metadata);
    }

}

