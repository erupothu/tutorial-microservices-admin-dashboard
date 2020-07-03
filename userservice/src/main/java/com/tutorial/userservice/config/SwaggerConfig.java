package com.tutorial.userservice.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public Docket api() {
		final Set<String> protocols = new HashSet<String>();
		protocols.add("http");
		protocols.add("https");
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.tutorial.userservice.controller")).paths(PathSelectors.any())
				.build().pathMapping("").protocols(protocols).host(env.getProperty("swagger.host.url", ""));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Tutorial API").description("Tutorial API reference for developers")
				.termsOfServiceUrl("http://library.com").contact("library@gmail.com")
				.license("EVR Service License").licenseUrl("library@gmail.com").version("1.0").build();
	}

}
