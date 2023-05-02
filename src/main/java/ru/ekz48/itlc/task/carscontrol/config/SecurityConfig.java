package ru.ekz48.itlc.task.carscontrol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests().anyRequest().permitAll().and().build();
    }
}
