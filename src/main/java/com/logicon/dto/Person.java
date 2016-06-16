package com.logicon.dto;

import com.sun.jndi.cosnaming.IiopUrl;

import java.time.LocalDate;

/**
 * Created by Dom on 16.06.2016.
 */
public class Person{

    public String name;
    public String surname;
    //public Address address;
    public String category;

    //Constructors

    public Person(){}

    public Person(String name, String surname){
        this.name=name;
        this.surname=surname;
        this.category="Person";
        //this.address=address;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

  /*  public Address getAddress() {
        return address;
    } */

    public String getCategory () {
        return category;
    }

    //Setters

    public void setName(String name) {
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

  /*  public void setAddress(Address address) {
        this.address=address;
    } */

    public void setCategory (String category) {
        this.category=category;
    }

}
