package com.elastic.search.repository;


import com.elastic.search.entity.ElasticEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.util.List;
public interface ElasticRepository extends ElasticsearchRepository<ElasticEntity, String> {

    List<ElasticEntity> findByName(String firstName);

}
