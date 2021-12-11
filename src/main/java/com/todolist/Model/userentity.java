package com.todolist.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "todolist")
public class userentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private int password;

    @OneToMany(mappedBy = "userEntity")
    private List<todolistentity> todolistentityList;

}
