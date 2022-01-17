package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dao.TodoRepository;
import com.example.spring_data_jpa.entity.Todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
  private TodoRepository repository;

  @Autowired
    public ServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Todo> getAllTodo() {
        return repository.findAll();
    }

    @Override
    public void save(Todo todo) {
        repository.save(todo);
    }

    @Override
    public Todo getTodo(int id) {
        log.info("Start method!!!");
        Todo todos = repository.findById(id).orElse(null);
        if (todos == null) {
            log.warn("Такого дела нет!!!");
            throw new RuntimeException("Такого дела нет!!!");
        }
        return repository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);

    }

    @Override
    public void removeAllTodos() {
        repository.deleteAll();
    }

    @Override
    public List<Todo> getlistName(String title) {
        return repository.findAllByTitle(title);
    }
}
