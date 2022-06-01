package com.javacourse.workshopmongo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Document(collection = "user")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
}
