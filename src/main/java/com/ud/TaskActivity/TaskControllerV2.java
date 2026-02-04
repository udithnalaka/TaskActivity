package com.ud.TaskActivity;

import com.ud.TaskActivity.dto.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class TaskControllerV2 {

    @Operation(summary = "Get a Task", description = "Get a Task from the database by the given task_id")
    @GetMapping(path = "/task")
    @PreAuthorize("hasAuthority('SCOPE_readtask')")
    public String getTask() {
        return "Access Granted: Get a Task";
    }

    @Operation(summary = "Update a Task", description = "Update the task in the database")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Task.class))}),
            @ApiResponse(responseCode = "404", description = "Task not found", content = @Content)
    })
    @PostMapping("/task")
    @PreAuthorize("hasAuthority('SCOPE_updatetask')")
    public String updateTask() {
        return "Access Granted: Update a Task";
    }
}
