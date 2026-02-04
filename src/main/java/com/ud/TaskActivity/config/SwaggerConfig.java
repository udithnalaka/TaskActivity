package com.ud.TaskActivity.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi v1Api() {
        return GroupedOpenApi.builder()
                .group("v1")
                .pathsToMatch("/api/v1/**")
                .build();
    }

    @Bean
    public GroupedOpenApi v2Api() {
        return GroupedOpenApi.builder()
                .group("v2")
                .pathsToMatch("/api/v2/**")
                .build();
    }

    @Bean
    public OpenAPI defineOpenApi() {

        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Local Development");

        Contact myContact = new Contact();
        myContact.setName("Udith Nalaka");
        myContact.setEmail("u@n.com.au");

        Info info = new Info()
                .title("Task management system")
                .version("1.0")
                .description("This API exposes endpoints to manage Tasks")
                .contact(myContact);

        return new OpenAPI()
                .info(info)
                .servers(List.of(server));
    }
}
