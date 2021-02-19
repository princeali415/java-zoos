package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.repositories.AnimalRepository;
import com.lambdaschool.zoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService
{
    // connects this service to the zooRepository
    @Autowired
    private ZooRepository zooRepository;

    // connects this service to the animalRepository
    @Autowired
    private AnimalRepository animalRepository;


    // find all zoo service method (GET METHODS)
    @Override
    public ArrayList<Zoo> findAll(){
        ArrayList<Zoo> myList = new ArrayList<>();
        zooRepository.findAll().iterator().forEachRemaining(myList::add);
        return myList;
    }

    //find by id method
    @Override
    public Zoo findZooById(long id){
        return zooRepository.findById(id)
            .orElseThrow(()-> new EntityNotFoundException("Zoo id " + id + " Not Found"));
    }

    // Save method POST & PUT - incomplete (not needed for MVP)

    @Transactional
    @Override
    public Zoo save(Zoo zoo)
    {
        return null;
    }

    @Transactional
    @Override
    public Zoo update(Zoo zoo)
    {
        return null;
    }


    // Delete
    @Transactional
    @Override
    public void deleteById(long id){
        if(zooRepository.findById(id).isPresent()) {
            zooRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Zoo " + id + " Not Found");
        }
    }
}
