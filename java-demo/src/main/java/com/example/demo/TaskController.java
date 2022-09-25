package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Anthos cowboys!";
	}

	@GetMapping("/tasks")
	public Iterable<SimpleTask> getTasks() {
		return taskService.viewTaskList();
	}

	@PostMapping("/tasks")
	@ResponseStatus(HttpStatus.CREATED)
	public SimpleTask createTask(@RequestBody SimpleTask task) {
		return taskService.addTask(task);
	}

	@PutMapping("/tasks/{id}")
    public SimpleTask put(@PathVariable Long id, @RequestBody SimpleTask task) {
        return taskService.editTaskDetails(id, task);
    }
}

