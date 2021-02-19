package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    // returns list of all zoos
    ArrayList<Zoo> findAll();

    // returns zoo by id
    Zoo findZooById(long id);

    // Save zoo object given a complete zoo object
    Zoo save(Zoo zoo);

    // Update fields in zoo record refrenced by primary key(id)
    Zoo update(Zoo zoo);

    // Delete zoo record based off id
    void deleteById(long id);
}
