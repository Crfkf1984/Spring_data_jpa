package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Todo;

import java.util.List;

public interface Service {
    public List<Todo> getAllTodo();

    void save(Todo todo);

    Todo getTodo(int id);

    void remove(int id);

    void removeAllTodos();

    List<Todo> getlistName(String name);
}
