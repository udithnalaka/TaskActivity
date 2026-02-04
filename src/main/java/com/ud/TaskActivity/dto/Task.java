package com.ud.TaskActivity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Task data")
public class Task {

    @Schema(description = "task id", example = "1001", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("task_id")
    private String taskId;

    @Schema(description = "task summary", example = "Study Python")
    @JsonProperty("task_summary")
    private String taskSummary;

    @Schema(description = "task details")
    @JsonProperty("task_details")
    private String taskDetails;

    @Schema(description = "task owner", example = "Your name",  requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("task_owner")
    private String taskOwner;

    @Schema(description = "task owner email", example = "u@u.com",  requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email_address")
    private String email;

}
