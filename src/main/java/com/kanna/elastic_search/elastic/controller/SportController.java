package com.kanna.elastic_search.elastic.controller;

import com.kanna.elastic_search.elastic.service.SportService;
import com.kanna.elastic_search.elastic.entity.Sport;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elastic")
@RequiredArgsConstructor
public class SportController {

    private final SportService sportService;

    @PostMapping
    public  Sport save(@RequestBody Sport sport){
        return sportService.saveSport(sport);
    }
    @GetMapping
    public Iterable<Sport> all(){
        return sportService.findAllSport();
    }
    @GetMapping("/all")
    public List<Sport> allDesc(String key){
        return sportService.findSomethin(key);
    }
}
