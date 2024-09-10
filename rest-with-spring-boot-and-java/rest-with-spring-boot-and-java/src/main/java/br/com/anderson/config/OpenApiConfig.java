package br.com.anderson.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with Java and Spring Boot")
                        .version("v1")
                        .description("Registration of people")
                        .termsOfService("https://github.com/Anderson-Batista/rest-with-spring-boot-and-java")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("https://github.com/Anderson-Batista/rest-with-spring-boot-and-java")
                        )
                );
    }

}
