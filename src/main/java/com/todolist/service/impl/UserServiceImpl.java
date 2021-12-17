package com.todolist.service.impl;

import com.todolist.Model.UserEntity;
import com.todolist.repository.UserRepository;
import com.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public void add(UserEntity userEntity){
        this.userRepository.save(userEntity);
    }

    @Override
    public void update(UserEntity userEntity){

    }

    @Override
    @Transactional
    public void delete(UserEntity userEntity){
        this.userRepository.delete(userEntity);
    }

    @Override
    @Transactional
    public List<UserEntity> getAll(){
        return this.userRepository.findAll();
    }

}
