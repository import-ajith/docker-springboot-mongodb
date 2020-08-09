package com.demo.microservices.microservicesspringboot.controller;

import com.demo.microservices.microservicesspringboot.entity.User;
import com.demo.microservices.microservicesspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
public class ResourceController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public User getUser(@RequestParam(value = "name", defaultValue = "ajith") String name ){
        User user=repository.findByName(name);
        return user;
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        List<User> users=repository.findAll();
        return users;
    }

    @PostMapping
    public User insertUser(@RequestBody User newUser){
        return repository.save(newUser);
    }

    @DeleteMapping("/{name}")
    void deleteUser(@PathVariable String name) {
        repository.deleteByName(name);
    }


}

