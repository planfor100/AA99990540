package com.example.demo.controller;

import com.example.demo.service.TodoItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class SabunRestController {

    //private TodoItemService todoService;

    public SabunRestController(TodoItemService todoService) {
        //this.todoService = todoService;
    }

    @GetMapping("/user")
    public String sabun() {
        return "99990540";
    }

}
