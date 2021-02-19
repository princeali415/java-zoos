package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephones extends Auditable
{
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;

    private String phonenumber;

    //foreign key to the Zoo table indicating the zoo who holds this telephone number
    //There is a one to many relationship between zoos and telephones.
    //           Many to one relationship between telephone and zoos***
    //One zoo can have multiple phone numbers but each phone number(telephones) can only belong to one zoo.
    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    @JsonIgnoreProperties(value = "telephones")
    private Zoo zoo;

    //Constructors
    public Telephones()
    {
        //required by JPA
    }

    public Telephones(
        String phonetype,
        String phonenumber)
    {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    //Getter and Setters
    public long getPhoneid()
    {
        return phoneid;
    }

    public void setPhoneid(long phoneid)
    {
        this.phoneid = phoneid;
    }

    public String getPhonetype()
    {
        return phonetype;
    }

    public void setPhonetype(String phonetype)
    {
        this.phonetype = phonetype;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public Zoo getZoo()
    {
        return zoo;
    }

    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }
}
