package com.elastic.search.service;

import com.elastic.search.entity.ElasticEntity;

import java.util.List;

public interface ElasticService {
    public Iterable<ElasticEntity> all();
    public List<ElasticEntity> findByName(String name);
    public ElasticEntity add(ElasticEntity elasticEntity);
}
