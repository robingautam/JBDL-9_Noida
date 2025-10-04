package org.gfg.JBDL9_OAUTH;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.oauth2Login(oauth -> {
                    oauth.loginPage("/customLogin.html");
                    oauth.defaultSuccessUrl("/get/data");

                }).authorizeHttpRequests(auth->{
                    auth.requestMatchers("/customLogin.html/**", "/token/received").permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2Login(Customizer.withDefaults()).build();
    }
}
