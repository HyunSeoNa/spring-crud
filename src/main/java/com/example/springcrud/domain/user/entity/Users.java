package com.example.springcrud.domain.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

/**
 * fileName     : UserEntity.java
 * author       : hyunseo
 * date         : 2025. 2. 24.
 * description  : 사용자 Entity
 */
@Entity
@Table(name = "tb_user")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String usr_id;
    @Column
    private String password;
    @Column
    private String usr_nm;
    @Column
    private String reg_dt;
    @Column
    private String reg_id;
    @Column
    private String mod_id;
    @Column
    private String mod_dt;
    @Column
    private String sts;
}
