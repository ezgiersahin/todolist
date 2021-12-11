package com.todolist.repository;

import com.todolist.Model.todolistentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todolistrepository  extends JpaRepository<todolistentity, Long>{



}
