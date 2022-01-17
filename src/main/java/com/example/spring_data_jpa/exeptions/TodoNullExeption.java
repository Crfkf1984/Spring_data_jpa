package com.example.spring_data_jpa.exeptions;

public class TodoNullExeption extends RuntimeException{
    public TodoNullExeption(String message) {
        super(message);
    }
}
