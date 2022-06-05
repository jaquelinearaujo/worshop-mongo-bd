package com.javacourse.workshopmongo.dto;

import com.javacourse.workshopmongo.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }
}
