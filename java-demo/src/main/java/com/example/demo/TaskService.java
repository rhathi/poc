package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Iterable<SimpleTask> viewTaskList() {
        return taskRepository.findAll();
    }

    public SimpleTask addTask(SimpleTask task) {
        return taskRepository.save(task);
    }

    public SimpleTask editTaskDetails(Long id, SimpleTask task) {
		return taskRepository.findById(id)
				.map(existingTask -> {
					existingTask.setStep1(task.getStep1());
					existingTask.setStep2(task.getStep2());
					return taskRepository.save(existingTask);
				}).orElseGet(() -> addTask(task));
    }
}
