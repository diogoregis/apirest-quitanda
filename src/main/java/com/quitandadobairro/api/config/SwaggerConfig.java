package com.quitandadobairro.api.config;

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
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.quitandadobairro.api"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    @SuppressWarnings("rawtypes")
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Quitanda do Bairro API",
                "API REST de cadastro de produtos em Quintanda - Projeto Banco de dados - ADS - Prof: Rodrigo Brasileiro - GRUPO 03 - AESO.",
                "1.0.5",
                "Terms of Service",
                new Contact("DIOGO REGIS", "www.diogoregis.com.br",
                        "eu@diogoregis.com.br"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

}
