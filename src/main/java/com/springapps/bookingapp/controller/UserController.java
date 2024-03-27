package com.springapps.bookingapp.controller;

import com.springapps.bookingapp.dto.UserRequestDTO;
import com.springapps.bookingapp.entities.RoleType;
import com.springapps.bookingapp.entities.User;
import com.springapps.bookingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addNewUser(userRequestDTO));
    }

    @PostMapping("/{roleType}/user/{userId}")
    public ResponseEntity<?> addRoleToUser (@PathVariable RoleType roleType, @PathVariable Long userId){
        return ResponseEntity.ok(userService.addRoleToUser(roleType,userId));
    }
}
