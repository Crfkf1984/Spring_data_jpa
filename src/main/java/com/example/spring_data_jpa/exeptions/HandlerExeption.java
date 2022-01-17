package com.example.spring_data_jpa.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerExeption {
    @ExceptionHandler
    public ResponseEntity<TodoExeptions> todoExeptions(TodoNullExeption exeption) {
        TodoExeptions data = new TodoExeptions();
        data.setInfo(exeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<TodoExeptions> todoExeptions(Exception exeption) {
        TodoExeptions data = new TodoExeptions();
        data.setInfo(exeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
