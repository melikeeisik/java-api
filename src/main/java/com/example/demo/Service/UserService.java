package com.example.demo.Service;

import com.example.demo.Entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUser();
    UserEntity saveUser(UserEntity userEntity);
}
