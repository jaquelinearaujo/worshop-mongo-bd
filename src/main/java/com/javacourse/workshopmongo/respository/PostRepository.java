package com.javacourse.workshopmongo.respository;

import com.javacourse.workshopmongo.domain.Post;
import com.javacourse.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
