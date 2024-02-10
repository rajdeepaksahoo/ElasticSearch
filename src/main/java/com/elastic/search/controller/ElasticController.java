package com.elastic.search.controller;

import com.elastic.search.entity.ElasticEntity;
import com.elastic.search.service.ElasticService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/elasticSearch")
public class ElasticController {
    private ElasticService elasticService;
    @PostMapping("/add")
    public ResponseEntity<ElasticEntity> add(@RequestBody ElasticEntity elasticEntity){
        return new ResponseEntity<>(elasticService.add(elasticEntity), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<Iterable<ElasticEntity>> all(){
        return new ResponseEntity<>(elasticService.all(),HttpStatus.OK);
    }

    @GetMapping("/byName/{name}")
    public ResponseEntity<List<ElasticEntity>> byName(@PathVariable String name){
        return new ResponseEntity<>(elasticService.findByName(name),HttpStatus.OK);
    }
}
