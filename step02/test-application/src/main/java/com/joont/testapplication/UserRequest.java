package com.joont.testapplication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;

    private Integer age;

    public User toEntity() {
        return new User(name, age);
    }
}
