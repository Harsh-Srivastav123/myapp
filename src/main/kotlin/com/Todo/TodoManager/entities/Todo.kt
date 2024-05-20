package com.Todo.TodoManager.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="todos")
data class Todo (
        @Id
        var id:String="",
        @Column(name="todo_title",length=500)
        var title:String,
       var content:String,
       var complete:Boolean,

     ){
        constructor():this("","","",false){}
}