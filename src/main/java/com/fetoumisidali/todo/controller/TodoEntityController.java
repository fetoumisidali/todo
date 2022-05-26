package com.fetoumisidali.todo.controller;

import com.fetoumisidali.todo.entity.TodoEntity;
import com.fetoumisidali.todo.service.TodoEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sidali Fetoumi
 * @date 5/26/2022
 * Enjoy Coding :)
 */
@RestController
@RequestMapping(value = "/todo")
public class TodoEntityController {

    private final TodoEntityService todoEntityService;

    public TodoEntityController(TodoEntityService todoEntityService) {
        this.todoEntityService = todoEntityService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoEntity saveTodo(@RequestBody TodoEntity todo){
        return todoEntityService.saveTodo(todo);
    }

    @GetMapping
    public List<TodoEntity> findAll(){
        return todoEntityService.findAll();
    }

    @GetMapping(value = "/{id}")
    public TodoEntity findById(@PathVariable Long id){
        return todoEntityService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        todoEntityService.deleteById(id);
    }
    @PutMapping(value = "/{id}")
    public TodoEntity editById(@PathVariable Long id,@RequestBody TodoEntity todo){
        return todoEntityService.editById(id,todo);
    }
}
