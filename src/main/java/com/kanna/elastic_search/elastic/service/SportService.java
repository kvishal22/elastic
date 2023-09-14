package com.kanna.elastic_search.elastic.service;

import com.kanna.elastic_search.elastic.entity.Sport;
import com.kanna.elastic_search.elastic.repo.SportRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportService {

    private final SportRepo sportRepo;

    public Iterable<Sport> findAllSport(){
        return sportRepo.findAll();
    }
    public Sport saveSport(Sport sport){
        return sportRepo.save(sport);
    }

    public List<Sport> findSomethin(String key){
        return sportRepo.findBySportDescFuzzy(key);
    }
}
