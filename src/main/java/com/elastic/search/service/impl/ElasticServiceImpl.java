package com.elastic.search.service.impl;

import com.elastic.search.entity.ElasticEntity;
import com.elastic.search.repository.ElasticRepository;
import com.elastic.search.service.ElasticService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ElasticServiceImpl implements ElasticService {
    @Autowired
    private ElasticRepository  elasticRepository;
    @Override
    public Iterable<ElasticEntity> all() {
        return elasticRepository.findAll();
    }

    @Override
    public List<ElasticEntity> findByName(String name) {
        return elasticRepository.findByName(name);
    }

    @Override
    public ElasticEntity add(ElasticEntity elasticEntity) {
        elasticEntity.setId(UUID.randomUUID().toString());
        return elasticRepository.save(elasticEntity);
    }
}
