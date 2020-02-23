package com.colamoon.app.api.auth;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRole is a Querydsl query type for Role
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRole extends EntityPathBase<Role> {

    private static final long serialVersionUID = -2080576452L;

    public static final QRole role1 = new QRole("role1");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath role = createString("role");

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public QRole(String variable) {
        super(Role.class, forVariable(variable));
    }

    public QRole(Path<? extends Role> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRole(PathMetadata metadata) {
        super(Role.class, metadata);
    }

}

