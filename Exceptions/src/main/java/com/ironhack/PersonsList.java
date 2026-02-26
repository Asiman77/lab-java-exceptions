package com.ironhack;

import java.util.List;

import static java.lang.Character.getName;

public class PersonsList {

    private List<Person> people;

    public PersonsList(List<Person> people) {
        this.people = people;
    }

    Person person1 = new Person(101L, 28, "Software Engineer", "Ali", "Aliyev");
    public Person findByName(String name){
        for (Person p : people){
            if(p.getName().equals(name)){
                return p;
            }

        }
        return null;
    }

    public Person clone(Person p , long newId){
        return new Person(newId , p.getAge() , p.getOccupation() , p.getFirstname() , p.getLastName());
    }



}
