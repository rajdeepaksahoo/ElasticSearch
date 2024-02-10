package com.elastic.search.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Dynamic;

@Data
@Document(indexName = "myentity",createIndex = true,alwaysWriteMapping = true,dynamic = Dynamic.TRUE)
public class MyEntity {
    private String id;
    private String name;
}
