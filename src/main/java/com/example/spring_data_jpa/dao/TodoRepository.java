package com.example.spring_data_jpa.dao;


import com.example.spring_data_jpa.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findAllByTitle(String title);
}
