package com.todolist.controller;

import com.todolist.Model.ToDoListEntity;
import com.todolist.service.impl.ToDoListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    @Autowired
    private ToDoListServiceImpl toDoListService;
    @GetMapping("/list")
    public List<ToDoListEntity> get(){
        return this.toDoListService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody ToDoListEntity toDoListEntity){
    this.toDoListService.delete(toDoListEntity);
    }
    @PostMapping("/add")
    public void add(@RequestBody ToDoListEntity toDoListEntity ){
        this.toDoListService.add(toDoListEntity);
    }
}