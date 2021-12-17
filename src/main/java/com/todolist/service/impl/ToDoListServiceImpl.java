package com.todolist.service.impl;

import com.todolist.Model.ToDoListEntity;
import com.todolist.repository.ToDoListRepository;
import com.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class ToDoListServiceImpl implements ToDoListService {
    private ToDoListRepository toDoListRepository;

    @Autowired
    public void ToDoListServiceImpl(ToDoListRepository toDoListRepository){
      this.toDoListRepository=toDoListRepository;
    }

    @Override
    public void add(ToDoListEntity toDoListEntity){
        this.toDoListRepository.save(toDoListEntity);
    }

    @Override
    public void update(ToDoListEntity toDoListEntity){

    }

    @Override
    @Transactional
    public void delete(ToDoListEntity toDoListEntity){
        this.toDoListRepository.delete(toDoListEntity);
    }

    @Override
    @Transactional
    public List<ToDoListEntity> getAll(){
        return this.toDoListRepository.findAll();
    }
}
