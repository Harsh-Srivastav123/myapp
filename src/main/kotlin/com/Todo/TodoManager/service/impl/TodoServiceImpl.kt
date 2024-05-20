package com.Todo.TodoManager.service.impl

import com.Todo.TodoManager.Repository.TodoRepository
import com.Todo.TodoManager.entities.Todo
import com.Todo.TodoManager.service.TodoService
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoServiceImpl(var todoRepository: TodoRepository): TodoService {
    override fun createTodo(todo: Todo): Todo {
        todo.id = UUID.randomUUID().toString()
      return  this.todoRepository.save(todo)
    }




    override fun updateTodo(todoId: String, todo: Todo): Todo {
       val oldtodo= this.todoRepository.findById(todoId).orElseThrow(){RuntimeException("Todo not found")}
        oldtodo.title=todo.title;
        oldtodo.content=todo.content;
        oldtodo.complete=todo.complete;
      return  todoRepository.save(oldtodo)

    }

    override fun deleteTodo(todoId: String) {
        val oldtodo= todoRepository.findById(todoId).orElseThrow(){RuntimeException("Todo not found")}
        this.todoRepository.delete(oldtodo)
    }

    override fun getallTodos(): List<Todo> =todoRepository.findAll()



    override fun getTodo(todoId: String): Todo = todoRepository.findById(todoId).orElseThrow(){RuntimeException("Todo not found")}


}

