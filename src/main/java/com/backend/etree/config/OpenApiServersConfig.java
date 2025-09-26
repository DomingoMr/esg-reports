package com.backend.etree.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OpenApiServersConfig {
    @Bean
    public OpenAPI openAPI() {
        // rutas relativas: heredarán https si la página está en https
        return new OpenAPI().servers(List.of(new Server().url("/")));
    }
}
