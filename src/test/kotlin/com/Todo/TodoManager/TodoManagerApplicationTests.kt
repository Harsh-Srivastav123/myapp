package com.Todo.TodoManager

import com.Todo.TodoManager.entities.Todo
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TodoManagerApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun KotlinTest() {
		val todo= Todo("124","this is test title","this is test content",true)
		println(todo)
	}

}
