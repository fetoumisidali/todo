package com.fetoumisidali.todo.repository;

import com.fetoumisidali.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoEntityRepository extends JpaRepository<TodoEntity, Long> {
}