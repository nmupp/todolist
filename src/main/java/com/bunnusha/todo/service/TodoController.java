package com.bunnusha.todo.service;

import com.bunnusha.todo.domain.Todo;
import com.bunnusha.todo.domain.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoList todoList;

    @RequestMapping
    public TodoList todo() {
        List<Todo> list = new LinkedList<>();
        list.add(new Todo("Get milk today"));
        todoList.setList(list);
        return todoList;
    }

}
