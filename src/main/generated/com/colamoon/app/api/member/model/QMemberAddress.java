package com.colamoon.app.api.member.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberAddress is a Querydsl query type for MemberAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberAddress extends EntityPathBase<MemberAddress> {

    private static final long serialVersionUID = -391863967L;

    public static final QMemberAddress memberAddress = new QMemberAddress("memberAddress");

    public final com.colamoon.app.api.common.model.QBaseEntity _super = new com.colamoon.app.api.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<com.colamoon.app.api.common.model.ActiveType> active = _super.active;

    public final StringPath address1 = createString("address1");

    public final StringPath address1Second = createString("address1Second");

    public final StringPath address2 = createString("address2");

    public final EnumPath<AddressType> addressType = createEnum("addressType", AddressType.class);

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath idDefault = createBoolean("idDefault");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath postNumber = createString("postNumber");

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public QMemberAddress(String variable) {
        super(MemberAddress.class, forVariable(variable));
    }

    public QMemberAddress(Path<? extends MemberAddress> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberAddress(PathMetadata metadata) {
        super(MemberAddress.class, metadata);
    }

}

