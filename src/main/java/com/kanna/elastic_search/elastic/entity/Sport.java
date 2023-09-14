package com.kanna.elastic_search.elastic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "sports")
@Data
public class Sport {

    private String id;
    private String sportName;
    private String sportDesc;
}
