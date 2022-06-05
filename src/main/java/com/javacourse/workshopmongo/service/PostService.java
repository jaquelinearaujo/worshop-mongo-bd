package com.javacourse.workshopmongo.service;

import com.javacourse.workshopmongo.domain.Post;
import com.javacourse.workshopmongo.respository.PostRepository;
import com.javacourse.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        if (post.isEmpty()) {
            throw new ObjectNotFoundException("Object not found");
        }
        return post.get();
    }
}
