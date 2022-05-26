package com.fetoumisidali.todo.service;

import com.fetoumisidali.todo.entity.TodoEntity;

import java.util.List;

/**
 * @author Sidali Fetoumi
 * @date 5/26/2022
 * Enjoy Coding :)
 */
public interface TodoEntityService {
    TodoEntity saveTodo(TodoEntity todo);
    List<TodoEntity> findAll();
    TodoEntity findById(Long id);
    void deleteById(Long id);
    TodoEntity editById(Long id,TodoEntity todo);
}
