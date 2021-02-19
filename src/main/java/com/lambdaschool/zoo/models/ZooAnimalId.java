package com.lambdaschool.zoo.models;

import java.io.Serializable;
import java.util.Objects;

public class ZooAnimalId implements Serializable
{
    private long zoo;

    private long animal;

    public ZooAnimalId()
    {
        //required by JPA
    }

    //getters and setters

    public long getZoo()
    {
        return zoo;
    }

    public void setZoo(long zoo)
    {
        this.zoo = zoo;
    }

    public long getAnimal()
    {
        return animal;
    }

    public void setAnimal(long animal)
    {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        ZooAnimalId that = (ZooAnimalId) o;
        return zoo == that.zoo && animal == that.animal;
    }

    @Override
    public int hashCode()
    {
        return 1;
    }
}
