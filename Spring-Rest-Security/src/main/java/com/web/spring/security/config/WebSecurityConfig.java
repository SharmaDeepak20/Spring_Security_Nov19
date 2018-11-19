package com.web.spring.security.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configurable
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//http.authorizeRequests().anyRequest().authenticated();
		//http.authorizeRequests().antMatchers("/","/api/**").permitAll().anyRequest().authenticated();
		http.authorizeRequests().antMatchers("/","/api/**").access("hasRole('USER')").antMatchers("/adimn/**").access("hasRole('ADMIN')");
	    http.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("abc").password("123").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
	}
}
