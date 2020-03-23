package com.colamoon.app.api.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("local")
@SpringBootTest
class SampleRepositoryImplTest {

    @Autowired
    private SampleRepositoryImpl sampleRepository;

    @Test
    void findAllTest() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        sampleRepository.findAll(PageRequest.of(0, 10, sort));
    }
}