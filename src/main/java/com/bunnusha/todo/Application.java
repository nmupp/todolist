package com.bunnusha.todo;

import com.bunnusha.todo.domain.Account;
import com.bunnusha.todo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(final AccountRepository accountRepository) {
        return (strings) -> {
            Account account = new Account("narsi", "narsi");
            accountRepository.save(account);
        };
    }
}
