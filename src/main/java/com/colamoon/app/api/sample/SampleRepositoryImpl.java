package com.colamoon.app.api.sample;

import com.colamoon.app.api.common.model.ActiveType;
import com.colamoon.app.api.sample.constant.SampleStatus;
import com.colamoon.app.api.sample.model.QSample;
import com.colamoon.app.api.sample.model.Sample;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SampleRepositoryImpl extends QuerydslRepositorySupport {
    @PersistenceContext
    private EntityManager entityManager;

    public SampleRepositoryImpl() {
        super(Sample.class);
    }

    public Page<Sample> findAll(PageRequest pageable) {
        QSample sample = QSample.sample;
        JPAQuery<Sample> query = new JPAQuery(entityManager);
        query.select(
                sample
        )
                .from(sample)
                .where(
                        sample.active.eq(ActiveType.ACTIVE)
                                .and(sample.status.eq(SampleStatus.INIT))
                );
        List<Sample> samples = getQuerydsl().applyPagination(pageable, query).fetch();
        return new PageImpl<>(samples, pageable, query.fetchCount());
    }


}