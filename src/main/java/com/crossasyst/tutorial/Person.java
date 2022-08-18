package com.crossasyst.tutorial;

import javax.lang.model.element.Name;

public class Person {

    private Name personName;

    public Person(Name personName){
        this.personName=personName;
    }
    public Person(){

    }

    public String helloWorld() {
        return "Hello World";
    }


    public String hello(String name) {
        return "Hello "+name;
    }


    public int numberOfPerson() {

        return 3;
    }
}
