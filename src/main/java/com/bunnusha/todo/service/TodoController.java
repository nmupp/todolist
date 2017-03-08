package com.bunnusha.todo.service;

import com.bunnusha.todo.business.TodoBusiness;
import com.bunnusha.todo.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoBusiness todoBusiness;

    @RequestMapping
    public List<Todo> todoList() {
        return todoBusiness.findAllTasks();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveTask(@RequestBody Todo todo) {
        todoBusiness.saveTask(todo);
        return ResponseEntity.ok(todo);
    }

}
