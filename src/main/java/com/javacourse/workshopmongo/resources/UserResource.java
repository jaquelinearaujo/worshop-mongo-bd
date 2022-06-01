package com.javacourse.workshopmongo.resources;

import com.javacourse.workshopmongo.domain.User;
import com.javacourse.workshopmongo.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
       List<User> list = userService.findAll();

       return ResponseEntity.ok().body(list);
    }
}
