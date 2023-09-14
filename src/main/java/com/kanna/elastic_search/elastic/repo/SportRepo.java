package com.kanna.elastic_search.elastic.repo;

import com.kanna.elastic_search.elastic.entity.Sport;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SportRepo extends ElasticsearchRepository<Sport,Integer> {
    @Query("{" +
            " \"match\": {" +
            "  \"sportDesc\": {" +
            "   \"query\": \"?0\"," +
            "   \"fuzziness\": 1" +
            "  }" +
            " }" +
            "}")
    List<Sport> findBySportDescFuzzy(String keyword);

}
