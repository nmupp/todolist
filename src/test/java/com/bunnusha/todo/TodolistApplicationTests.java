package com.bunnusha.todo;

import com.bunnusha.todo.domain.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TodolistApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void todoListCount() {
        List todoList = this.restTemplate.getForObject("/todo",List.class);
        assertThat(todoList.size()).isGreaterThan(0);
	}

	@Test
	public void postTask() {
        Todo todo = new Todo();
        todo.setTask("task from test");
        ResponseEntity<Todo> response = this.restTemplate.postForEntity("/todo",todo,Todo.class);
        assertThat(response.getBody().getTask()).isEqualTo("task from test");
	}

}
