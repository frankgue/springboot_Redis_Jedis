package com.gkfcsolution.springboot_redis_jedis.controller;

import com.gkfcsolution.springboot_redis_jedis.model.User;
import com.gkfcsolution.springboot_redis_jedis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created on 2025 at 20:34
 * File: null.java
 * Project: springboot_Redis_Jedis
 *
 * @author Frank GUEKENG
 * @date 04/10/2025
 * @time 20:34
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        boolean result = userService.saveUser(user);
        if (result)
            return ResponseEntity.ok("User Created Successfully!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping(value = "/user")
    public ResponseEntity<List<User>> fetchAllUser(){
        List<User> users;
        users = userService.fetchAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable("id") Long id){
        User user = userService.fetchUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        boolean result = userService.deleteUser(id);
        if (result) return ResponseEntity.ok("User created Successfully!!");
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
