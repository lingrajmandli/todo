package com.example.todo.controller;

import com.example.todo.model.todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class todoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<todo> getAllTodos() {
        return todoService.getallTodos();
    }

    @PostMapping
    public todo createTodo(@RequestBody todo todo) {
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public todo updateTodo(@PathVariable Long id,
                           @RequestBody todo todo){
        return todoService.update(id, todo);
    }
    @DeleteMapping("{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.delete(id);
    }

}
