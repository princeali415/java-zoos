package com.lambdaschool.zoo.controllers;


import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/zoos")
public class ZooController
{
    @Autowired
    private ZooService zooService;

    //GET
    //get a list of all zoos
    //http://localhost:2019/zoos/zoo
    @GetMapping(value = "/zoo", produces = "application/json")
    public ResponseEntity<?> listAllZoos()
    {
        List<Zoo> zooList = zooService.findAll();
        return new ResponseEntity<>(zooList, HttpStatus.OK);
    }

    // get zoo by id
    //http://localhost:2019/zoos/zoo/{zooid}
    @GetMapping(value = "/zoo/{zooid}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable long zooid)
    {
        Zoo zoo = zooService.findZooById(zooid);
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }
}
