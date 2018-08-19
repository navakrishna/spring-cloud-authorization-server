package com.security.authorization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

/**
 * Ut enables in memory authentication.
 * 
 * @author Nava Krishna
 *
 */
@Configuration
public class AuthorizationConfig extends GlobalAuthenticationConfigurerAdapter {
  
	
	public void init(AuthenticationManagerBuilder auth) throws Exception{
		auth
		 .inMemoryAuthentication()
		 .withUser("test").password("{noop}test").roles("USER")
		 .and().withUser("admin").password("{noop}admin").roles("USER");
		 
	}
	
}
