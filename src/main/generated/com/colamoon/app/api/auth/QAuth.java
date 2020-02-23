package com.colamoon.app.api.auth;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuth is a Querydsl query type for Auth
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuth extends EntityPathBase<Auth> {

    private static final long serialVersionUID = -2081076882L;

    public static final QAuth auth = new QAuth("auth");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    public final ListPath<AuthRole, QAuthRole> authRoles = this.<AuthRole, QAuthRole>createList("authRoles", AuthRole.class, QAuthRole.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath password = createString("password");

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public final StringPath username = createString("username");

    public QAuth(String variable) {
        super(Auth.class, forVariable(variable));
    }

    public QAuth(Path<? extends Auth> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuth(PathMetadata metadata) {
        super(Auth.class, metadata);
    }

}

