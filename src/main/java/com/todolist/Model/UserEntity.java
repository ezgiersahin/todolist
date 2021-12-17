package com.todolist.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "todolist")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "usersurname")
    private int usersurname;

    @OneToMany(mappedBy = "userEntity")
    private List<ToDoListEntity> todolistentityList;

}
