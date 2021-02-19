package com.lambdaschool.zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal
{
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false)
    private String animaltype;

    //Constructors
    public Animal()
    {
        //required by JPA
    }

    public Animal(
        String animaltype)
    {
        this.animaltype = animaltype;
    }

    //Getter and Setters
    public long getAnimalid()
    {
        return animalid;
    }

    public void setAnimalid(long animalid)
    {
        this.animalid = animalid;
    }

    public String getAnimaltype()
    {
        return animaltype;
    }

    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }
}
