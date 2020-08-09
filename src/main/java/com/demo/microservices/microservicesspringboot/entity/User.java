package com.demo.microservices.microservicesspringboot.entity;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public String id;

    public String name;
    public String email;
    public Integer age;
    public String address;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
