package com.todolist.service;

import com.todolist.Model.ToDoListEntity;

import java.util.List;

public interface ToDoListService {

    void add(ToDoListEntity toDoListEntity);
    void update(ToDoListEntity toDoListEntity);
    void delete(ToDoListEntity toDoListEntity);
    List<ToDoListEntity> getAll();

}
