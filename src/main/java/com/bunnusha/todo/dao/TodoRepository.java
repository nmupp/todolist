package com.bunnusha.todo.dao;

import com.bunnusha.todo.domain.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,Integer> {

}
