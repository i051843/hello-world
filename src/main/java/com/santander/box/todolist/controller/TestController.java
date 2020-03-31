package com.santander.box.todolist.controller;

import com.santander.box.todolist.entity.TodoList;
import com.santander.box.todolist.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/test")
@RestController
public class TestController {

    @Autowired
    private TodoListRepository repository;

    @RequestMapping(value="/send" , method = RequestMethod.GET, produces = "application/json")
    public void test() {
        TodoList obj = new TodoList();
        obj.setPk(repository.getNextSequence() + 0.28);
        obj.setFk_owner_obj(1.28);
        obj.setTitle("Test");
        obj.setDescription("Test description");

        repository.save(obj);
    }
    
    @RequestMapping(value="/get" , method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<TodoList>> findAll() {
  
        List<TodoList> ret = repository.findAll();
        return new ResponseEntity<>(ret, HttpStatus.OK)
    }
}
