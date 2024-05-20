package com.Todo.TodoManager.Repository

import com.Todo.TodoManager.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository:JpaRepository<Todo,String> {
}