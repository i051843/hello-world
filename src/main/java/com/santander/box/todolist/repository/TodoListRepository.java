package com.santander.box.todolist.repository;

import com.santander.box.todolist.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Double> {

    @Query(nativeQuery = true,
            value = "select GOM_GLB_RUN.F___SEQUENCE('T_PGT_TODO_LIST_S') from dual")
    public Double getNextSequence();
}
