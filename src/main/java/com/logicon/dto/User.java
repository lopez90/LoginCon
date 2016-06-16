package com.logicon.dto;

import java.time.LocalDate;

/**
 * Created by Dom on 16.06.2016.
 */
public class User extends Person {

    private LocalDate birthdate;
    private String email;

    //Constructor

    public User(String name,String surname, LocalDate birthdate, String email){
        super(name,surname);
        this.birthdate=birthdate;
        this.email=email;
        this.category="User";
    }

    public User(Person person,LocalDate birthdate,String email){
        this.name=person.name;
        this.surname=person.surname;
        //this.address=person.address;
        this.birthdate=birthdate;
        this.email=email;
        this.category="User";
    }

    //Setters

    private void setBithdate(LocalDate birthdate) {
        this.birthdate=birthdate;
    }

    private void setEmail(String email) {
        this.email=email;
    }

    //Getters

    private LocalDate getBirthdate() {
        return birthdate;
    }

    private String getEmail(){
        return email;
    }
}
