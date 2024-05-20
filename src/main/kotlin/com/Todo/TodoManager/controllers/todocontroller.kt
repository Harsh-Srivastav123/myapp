package com.Todo.TodoManager.controllers

import com.Todo.TodoManager.entities.Todo
import com.Todo.TodoManager.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
@CrossOrigin("*")
class todocontroller(val todoService: TodoService) {
    //create
    @PostMapping
    fun create(@RequestBody todo: Todo):Todo=todoService.createTodo(todo)
    @PutMapping("/{todoId}")
    fun update (@PathVariable todoId:String ,@RequestBody todo:Todo)=todoService.updateTodo(todoId,todo)
      @GetMapping
      fun getAll()=todoService.getallTodos();
    @GetMapping("{todoId}")
    fun getTodo(@PathVariable todoId:String)=todoService.getTodo(todoId)
    @DeleteMapping("{todoId}")
    fun delete(@PathVariable todoId:String)=todoService.deleteTodo(todoId)


}

