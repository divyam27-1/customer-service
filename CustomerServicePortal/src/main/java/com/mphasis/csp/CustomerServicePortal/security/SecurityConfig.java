package com.mphasis.csp.CustomerServicePortal.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;   // ✅ step 2: filter inject

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/login").permitAll()   // ✅ login open
                        .anyRequest().authenticated()               // ✅ बाकी secured
                )
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class); // ✅ attach filter

        return http.build();
    }
}