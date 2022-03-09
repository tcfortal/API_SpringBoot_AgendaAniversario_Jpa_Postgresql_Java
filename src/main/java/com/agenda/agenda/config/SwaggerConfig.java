package com.agenda.agenda.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean  
	public Docket cadastroApi() {  
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.agenda.agenda")) 
				.paths(regex("/api.*"))
				.build()  
			    .apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Agenda API REST",
				"API REST de cadastro de pessoas",
				"1.0",
				"Terms of Service",
				new Contact("Thiago César" , "https://www.linkedin.com/in/thiago-cesar-da-costa-andrade-willaredt-18120a208/", 
						"thiagocesarcosta13@gmail.com"),
				         "https://github.com/tcfortal" ,
				           "License Version 1.0", new ArrayList<VendorExtension>()
				
				);		return apiInfo;
	}
	

}
