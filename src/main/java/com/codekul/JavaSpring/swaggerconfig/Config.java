package com.codekul.JavaSpring.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Config {

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
//site- swagger configuration spring boot -> java configuration  copy  code and paste

//Run code-> localhost:8080/swagger.ui.html

//dependancy add->implementation group: 'io.springfox', name: 'springfox-swagger2', version: '2.7.0'
//	implementation group: 'io.springfox', name: 'springfox-swagger-ui', version: '2.7.0'