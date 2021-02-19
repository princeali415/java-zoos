package com.lambdaschool.zoo.controllers;


import com.lambdaschool.zoo.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/animals")
public class AnimalController
{
    @Autowired
    private AnimalService animalService;

    //GET
    // get count of all animals in zoos
    //http://localhost:2019/animals/count
    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getAnimalCount()
    {
        return new ResponseEntity<>(animalService.getCountAnimalInZoo(), HttpStatus.OK);
    }
}
