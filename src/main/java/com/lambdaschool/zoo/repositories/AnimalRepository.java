package com.lambdaschool.zoo.repositories;

import com.lambdaschool.zoo.models.Animal;
import com.lambdaschool.zoo.views.CountAnimalInZoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//Connects Animals to the rest of the application

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    // add custom query here for Count Animal in zoo
    @Query(value = "SELECT  a.animalid, a.animaltype, count(z.zooid) as countzoos " +
        "FROM zooanimals z RIGHT JOIN animals a ON z.animalid=a.animalid " +
        "GROUP BY a.animalid, a.animaltype " +
        "ORDER BY a.animaltype", nativeQuery = true)
    ArrayList<CountAnimalInZoo> getCountAnimalInZoo();
}
