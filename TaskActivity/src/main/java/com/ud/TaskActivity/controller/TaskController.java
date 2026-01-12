package com.ud.TaskActivity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping(path = "/task")
    @PreAuthorize("hasAuthority('SCOPE_readtask')")
    public String getTask() {
        return "Access Granted: Get Task details";
    }

    @PostMapping(path="/task")
    @PreAuthorize("hasAuthority('SCOPE_updatetask')")
    public String updateTask() {
        return "Access Granted: Update Task";
    }
}
