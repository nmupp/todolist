package com.bunnusha.todo.domain;

/**
 * Created by nmupp on 3/6/17.
 */
public class Todo {
    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Todo(String task) {
        this.task = task;
    }
}
