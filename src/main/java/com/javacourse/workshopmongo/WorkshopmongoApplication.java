package com.javacourse.workshopmongo;

import com.javacourse.workshopmongo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class WorkshopmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

}
