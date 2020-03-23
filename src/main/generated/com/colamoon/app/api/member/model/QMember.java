package com.colamoon.app.api.member.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -325318893L;

    public static final QMember member = new QMember("member1");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    public final StringPath birthday = createString("birthday");

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    public final StringPath email = createString("email");

    public final EnumPath<com.colamoon.app.api.member.constant.Gender> gender = createEnum("gender", com.colamoon.app.api.member.constant.Gender.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Long> leavedAt = createNumber("leavedAt", Long.class);

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> pointAccount = createNumber("pointAccount", Integer.class);

    public final StringPath realName = createString("realName");

    public final EnumPath<com.colamoon.app.api.member.constant.MemberStatus> status = createEnum("status", com.colamoon.app.api.member.constant.MemberStatus.class);

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public final StringPath username = createString("username");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

