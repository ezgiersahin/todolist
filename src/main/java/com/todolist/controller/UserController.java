package com.todolist.controller;

import com.todolist.Model.ToDoListEntity;
import com.todolist.Model.UserEntity;
import com.todolist.service.impl.ToDoListServiceImpl;
import com.todolist.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/list")
    public List<UserEntity> get(){
        return this.userService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody UserEntity userEntity){
        this.userService.delete(userEntity);
    }
    @PostMapping("/add")
    public void add(@RequestBody UserEntity userEntity ){
        this.userService.add(userEntity);
    }
}
