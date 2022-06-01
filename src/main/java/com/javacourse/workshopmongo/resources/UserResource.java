package com.javacourse.workshopmongo.resources;

import com.javacourse.workshopmongo.domain.User;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
       User maria = new User("1", "maria silva", "maria@gmail.com");
       User joao = new User("1", "joao silva", "joao@gmail.com");
       List<User> list = new ArrayList<>();
       list.addAll(Arrays.asList(joao, maria));

       return ResponseEntity.ok().body(list);
    }
}
