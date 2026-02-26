package com.ironhack;

import java.util.Objects;

public class Person {


    private String firstname;
    private String lastName;
    private long id;
    private String name ;
    private int age;
    private String occupation;

    public Person(long id , int age, String occupation , String firstname , String lastName) {
        this.id = id;
        this.age = age;
        this.occupation = occupation;
        this.firstname= firstname;
        this.lastName= lastName;
    }

    public void setAge(int age) {
        if(age<0){
            throw new RuntimeException("Age cant be less than 0 ");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(age, person.age) &&
                Objects.equals(occupation , person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age, occupation);
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(firstname == null){
            throw new IllegalArgumentException("First name cant be null ");
        }
        this.firstname=firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null){
            throw new IllegalArgumentException("Last name cant be null ");
        }
        this.lastName=lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return firstname + " " + lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
