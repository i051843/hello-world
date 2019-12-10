package com.santander.box.todolist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_PGT_TODO_LIST_S")
public class TodoList {

    @Id
    @Column(name = "PK", nullable = false)
    private Double pk;

    @Column(name = "FK_OWNER_OBJ", nullable = false)
    private Double fk_owner_obj;

    @Column(name = "FK_PARENT")
    private Double fk_parent;

    @Column(name = "FK_EXTENSION")
    private Double fk_extension;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "FK_DEAL")
    private Double fk_deal;

}
