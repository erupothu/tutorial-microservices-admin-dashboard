//package com.tutorial.userservice.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class UserSecurity extends WebSecurityConfigurerAdapter {
//	
//	@Bean
//    PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//	
//	@Autowired
//    private PasswordEncoder passwordEncoder;
//
//	public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//        	.formLogin().permitAll().and()
//            .authorizeRequests().antMatchers("/api/library/welcome", "/api/library/testing", "/login", "/oauth/authorize").permitAll()
//            .anyRequest().authenticated();
//        http.headers().frameOptions().disable();
//      }
//
//		public void configure(AuthenticationManagerBuilder auth) throws Exception {
//			auth.inMemoryAuthentication().withUser("harish").password(passwordEncoder.encode("harish"))
//					.roles("USER", "ADMIN", "MANAGER").and().withUser("suranga");
//		}
//}
