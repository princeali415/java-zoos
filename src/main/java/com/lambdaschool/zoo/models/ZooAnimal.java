package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "zooanimals")
public class ZooAnimal extends Auditable implements Serializable
{
    //Fields
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private Animal animal;

    private String incomingzoo;

    //Constructors
    public ZooAnimal()
    {
        //Required by JPA
    }

    public ZooAnimal(
        Zoo zoo,
        Animal animal,
        String incomingzoo)
    {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public ZooAnimal(
        Zoo zoo,
        Animal animal)
    {
        this.zoo = zoo;
        this.animal = animal;
    }

    //Getters and Setters

    public Zoo getZoo()
    {
        return zoo;
    }

    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public String getIncomingzoo()
    {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo)
    {
        this.incomingzoo = incomingzoo;
    }

    //Hashcode and equals
    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (o == null || this.getClass() != o.getClass()) { return false; }

        ZooAnimal that = (ZooAnimal) o;
        return ((this.zoo == null) ? 0 : this.zoo.getZooid()) ==
               ((that.zoo == null) ? 0 : that.zoo.getZooid()) &&
               ((this.animal == null) ? 0 : this.animal.getAnimalid()) ==
               ((that.animal == null) ? 0 : that.animal.getAnimalid());
    }

    @Override
    public int hashCode()
    {
        return 1;
    }
}
