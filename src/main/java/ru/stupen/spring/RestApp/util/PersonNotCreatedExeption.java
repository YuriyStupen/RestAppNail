package ru.stupen.spring.RestApp.util;

public class PersonNotCreatedExeption extends RuntimeException{
    public PersonNotCreatedExeption(String msg){
        super(msg);
    }
}
