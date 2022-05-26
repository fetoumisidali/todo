package com.fetoumisidali.todo.service.impl;

import com.fetoumisidali.todo.entity.TodoEntity;
import com.fetoumisidali.todo.repository.TodoEntityRepository;
import com.fetoumisidali.todo.service.TodoEntityService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * @author Sidali Fetoumi
 * @date 5/26/2022
 * Enjoy Coding :)
 */
@Service
public class TodoEntityServiceImpl implements TodoEntityService {


    private final TodoEntityRepository todoEntityRepository;

    public TodoEntityServiceImpl(TodoEntityRepository todoEntityRepository) {
        this.todoEntityRepository = todoEntityRepository;
    }


    @Override
    public TodoEntity saveTodo(TodoEntity todo) {
        return todoEntityRepository.save(todo);
    }

    @Override
    public List<TodoEntity> findAll() {
        return todoEntityRepository.findAll();
    }

    @Override
    public TodoEntity findById(Long id) {
        return todoEntityRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("todo not found."));
    }

    @Override
    public void deleteById(Long id) {
        todoEntityRepository.deleteById(findById(id).getId());
    }

    @Override
    public TodoEntity editById(Long id, TodoEntity todo) {
        TodoEntity todoEntity = findById(id);
        todoEntity.setTitle(todo.getTitle());
        todoEntity.setDescription(todo.getDescription());
        return todoEntityRepository.save(todoEntity);
    }
}
