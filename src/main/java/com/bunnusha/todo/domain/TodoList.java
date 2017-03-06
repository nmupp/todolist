package com.bunnusha.todo.domain;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nmupp on 3/6/17.
 */
@Component
public class TodoList {
    private List<Todo> list;

    public TodoList() {
        list = new LinkedList<>();
    }

    public List<Todo> getList() {
        return list;
    }

    public void setList(List<Todo> list) {
        this.list = list;
    }
}
