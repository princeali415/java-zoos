package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.repositories.AnimalRepository;
import com.lambdaschool.zoo.views.CountAnimalInZoo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public ArrayList<CountAnimalInZoo> getCountAnimalInZoo()
    {
        return animalRepository.getCountAnimalInZoo();
    }
}
