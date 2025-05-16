package com.example.todo.Repository;

import com.example.todo.model.todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<todo, Long>{
}
