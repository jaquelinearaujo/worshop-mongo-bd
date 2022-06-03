package com.javacourse.workshopmongo.service;

import com.javacourse.workshopmongo.domain.User;
import com.javacourse.workshopmongo.dto.UserDTO;
import com.javacourse.workshopmongo.respository.UserRepository;
import com.javacourse.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("Object not found");
        }
        return user.get();
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
