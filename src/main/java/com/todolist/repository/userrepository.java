package com.todolist.repository;

import com.todolist.Model.userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<UserEntity, Long> {
}
