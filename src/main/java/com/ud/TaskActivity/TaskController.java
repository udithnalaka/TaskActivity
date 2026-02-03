package com.ud.TaskActivity;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Operation(summary = "Get a Task")
    @GetMapping(path="/task")
    @PreAuthorize("hasAuthority('SCOPE_readtask')")
    public String getTask() {
        return "Access Granted: Get a Task";
    }

    @Operation(summary = "Update a Task")
    @PostMapping("/task")
    @PreAuthorize("hasAuthority('SCOPE_updatetask')")
    public String updateTask() {
        return "Access Granted: Update a Task";
    }
}
