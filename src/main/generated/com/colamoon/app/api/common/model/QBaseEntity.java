package com.colamoon.app.api.common.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseEntity is a Querydsl query type for BaseEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseEntity extends EntityPathBase<BaseEntity> {

    private static final long serialVersionUID = -284353828L;

    public static final QBaseEntity baseEntity = new QBaseEntity("baseEntity");

    public final EnumPath<ActiveType> active = createEnum("active", ActiveType.class);

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final NumberPath<Long> createdId = createNumber("createdId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    public final NumberPath<Long> updatedId = createNumber("updatedId", Long.class);

    public QBaseEntity(String variable) {
        super(BaseEntity.class, forVariable(variable));
    }

    public QBaseEntity(Path<? extends BaseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseEntity(PathMetadata metadata) {
        super(BaseEntity.class, metadata);
    }

}

