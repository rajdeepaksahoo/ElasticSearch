package com.elastic.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "abc")
@Data
public class ElasticEntity {
    @Id
    private String id;
    private String name;
    private String place;
}
