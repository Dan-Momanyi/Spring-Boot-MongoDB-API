package controller;

import model.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.TodoRepository;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepo;

    @GetMapping("/tasks")
    public ResponseEntity<?> getAllTasks() {
        List<TodoDTO> tasks = todoRepo.findAll();
        if(tasks.size() > 0) {
            return new ResponseEntity<List<TodoDTO>>(tasks, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No tasks available", HttpStatus.NOT_FOUND);
        }
    }
}
