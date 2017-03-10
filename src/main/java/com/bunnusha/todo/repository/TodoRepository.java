package com.bunnusha.todo.repository;

import com.bunnusha.todo.domain.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,Integer> {

}
