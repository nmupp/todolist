package com.bunnusha.todo.domain;

public class Todo {

    private String task;

    public Todo() {

    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Todo(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return String.format("Task = %s",task);
    }
}
