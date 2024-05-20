package com.Todo.TodoManager.service

import com.Todo.TodoManager.entities.Todo

interface TodoService {
    fun createTodo(todo: Todo):Todo
    fun updateTodo(todoId:String,todo:Todo):Todo
    fun deleteTodo(todoId:String)
    fun getallTodos():List<Todo>
    fun getTodo(todoId:String):Todo
}