package com.bunnusha.todo.repository;

import com.bunnusha.todo.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String>{
    Account findByUserName(String userName);
}
