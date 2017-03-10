package com.bunnusha.todo.business;

import com.bunnusha.todo.repository.TodoRepository;
import com.bunnusha.todo.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoBusiness {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAllTasks() {
        return todoRepository.findAll();
    }

    public void saveTask(Todo todo) {
        todoRepository.save(todo);
    }

}
