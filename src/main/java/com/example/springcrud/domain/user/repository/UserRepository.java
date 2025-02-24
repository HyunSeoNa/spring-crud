package com.example.springcrud.domain.user.repository;

import com.example.springcrud.domain.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName     : null.java
 * author       : hyunseo
 * date         : 2025. 2. 24.
 * description  :
 */
public interface UserRepository extends JpaRepository<Users, Long> {

}
