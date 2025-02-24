package com.example.springcrud.domain.user.service;

import com.example.springcrud.domain.user.entity.Users;
import com.example.springcrud.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * fileName     : UserService.java
 * author       : hyunseo
 * date         : 2025. 2. 24.
 * description  : 사용자 Service
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Users> getListUser(String userId) {
        return userRepository.findAll();
    }
}
