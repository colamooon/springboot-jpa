package com.colamoon.app.api.auth;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthRole is a Querydsl query type for AuthRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuthRole extends EntityPathBase<AuthRole> {

    private static final long serialVersionUID = -1940007164L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuthRole authRole = new QAuthRole("authRole");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    public final NumberPath<Long> authId = createNumber("authId", Long.class);

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QRole role;

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public QAuthRole(String variable) {
        this(AuthRole.class, forVariable(variable), INITS);
    }

    public QAuthRole(Path<? extends AuthRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuthRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuthRole(PathMetadata metadata, PathInits inits) {
        this(AuthRole.class, metadata, inits);
    }

    public QAuthRole(Class<? extends AuthRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
    }

}

