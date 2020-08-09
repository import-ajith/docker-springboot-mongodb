package com.demo.microservices.microservicesspringboot.repository;

import com.demo.microservices.microservicesspringboot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);

    void deleteByName(String name);
}
