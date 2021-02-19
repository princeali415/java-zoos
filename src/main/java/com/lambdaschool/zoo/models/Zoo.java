package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable
{
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    //There is a one to many relationship between zoos and telephones.
    //One zoo can have multiple phone numbers but each phone number(telephones)can
    //- only belong to one zoo.
    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    List<Telephones> telephones = new ArrayList<>();

    //Constructors
    public Zoo()
    {
        // required by JPA
    }

    public Zoo(String zooname)
    {
        this.zooname = zooname;
    }

    //Getter and Setters
    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }
}
