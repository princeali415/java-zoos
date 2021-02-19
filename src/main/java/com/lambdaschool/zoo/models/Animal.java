package com.lambdaschool.zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal extends Auditable
{
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false)
    private String animaltype;

    //Zooanimal represents a many to many relationship between zoos and animals.
    //A zoo may have many animal types and an animal type may be at many zoos.

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
