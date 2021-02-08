package com.cg.main.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author manasa
 *AppConfiguration extends WebMvcConfigurationSupport handling request from the controller
 *and helps in processing seed module operations
 */
@Configuration
@EnableSwagger2
public class AppConfiguration  extends WebMvcConfigurationSupport {
	/**
	 * Docket which is intended to be the primary interface into the swagger-springmvc framework.
	 * Provides sensible defaults and convenience methods for configuration.
	 * @return
	 */
	@Bean
	public Docket version1() {
	return new Docket(DocumentationType.SWAGGER_2).select()
	.apis(RequestHandlerSelectors.basePackage("com.cg.main.seedcontroller")).paths(regex(".*" + ".*"))
	.build().enable(true).groupName("Seed")
	.apiInfo(new ApiInfoBuilder().description("seed module").title("Customer Management System").build());
	}

	/**
	 * addResourceHandlers Overrides: addResourceHandlers in WebMvcConfigurationSupport
	 */
	 @Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	 }
}
