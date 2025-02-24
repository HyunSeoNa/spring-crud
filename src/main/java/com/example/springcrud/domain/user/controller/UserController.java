package com.example.springcrud.domain.user.controller;

import com.example.springcrud.domain.user.entity.Users;
import com.example.springcrud.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * fileName     : UserController.java
 * author       : hyunseo
 * date         : 2025. 2. 24.
 * description  : 사용자 Controller
 * https://kim-oriental.tistory.com/20#google_vignette
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/users")
    public ResponseEntity<?> getUser(@RequestParam(required = false, defaultValue = "") String userId) {
        List<Users> users = userService.getListUser(userId);
        return ResponseEntity.ok(users);
    }

}
