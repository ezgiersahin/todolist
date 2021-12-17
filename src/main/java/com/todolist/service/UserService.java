package com.todolist.service;

import com.todolist.Model.UserEntity;

import java.util.List;

public interface UserService {

    void add(UserEntity userEntity);

    void update(UserEntity userEntity);


    void delete(UserEntity userEntity);

    List<UserEntity> getAll();
}
