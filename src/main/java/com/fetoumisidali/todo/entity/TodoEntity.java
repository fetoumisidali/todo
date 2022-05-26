package com.fetoumisidali.todo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Sidali Fetoumi
 * @date 5/26/2022
 * Enjoy Coding :)
 */
@Data
@Entity
@Table(name = "TODO")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String description;
}
