package com.lambdaschool.zoo.repositories;

import com.lambdaschool.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;


//Connects zoos to rest of application

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    // special methods go here


}
