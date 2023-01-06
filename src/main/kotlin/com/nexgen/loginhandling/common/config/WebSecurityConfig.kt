package com.nexgen.loginhandling.common.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class WebSecurityConfig(){

    @Bean
    @Throws(Exception::class)
    fun filterChain(http : HttpSecurity) : SecurityFilterChain {
        http
            .authorizeHttpRequests()
            .requestMatchers("", "/home")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .permitAll()
            .and()
            .httpBasic()
        return http.build()
    }
}