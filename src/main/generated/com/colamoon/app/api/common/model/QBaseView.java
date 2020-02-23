package com.colamoon.app.api.common.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseView is a Querydsl query type for BaseView
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseView extends EntityPathBase<BaseView> {

    private static final long serialVersionUID = -1765155874L;

    public static final QBaseView baseView = new QBaseView("baseView");

    public final EnumPath<ActiveType> active = createEnum("active", ActiveType.class);

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final NumberPath<Long> createdId = createNumber("createdId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    public final NumberPath<Long> updatedId = createNumber("updatedId", Long.class);

    public QBaseView(String variable) {
        super(BaseView.class, forVariable(variable));
    }

    public QBaseView(Path<? extends BaseView> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseView(PathMetadata metadata) {
        super(BaseView.class, metadata);
    }

}

