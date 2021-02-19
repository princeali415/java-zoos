package com.lambdaschool.zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "zoos")
public class Zoo
{
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

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
