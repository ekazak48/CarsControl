package ru.ekz48.itlc.task.carscontrol.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productApi() {
        Server srv = new Server();
        srv.setUrl("http://localhost:8080/");
        srv.description("Local Server");
        return new OpenAPI().addServersItem(srv);
    }


}
