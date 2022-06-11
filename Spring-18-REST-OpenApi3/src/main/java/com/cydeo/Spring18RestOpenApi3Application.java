package com.cydeo;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.criteria.CriteriaBuilder;

@SpringBootApplication
public class Spring18RestOpenApi3Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring18RestOpenApi3Application.class, args);
    }


    //modify swagger output
    @Bean
    public  OpenAPI customOpenApi(){
        return new OpenAPI()
//                customize fields :
//                .servers()
//                .path(new Paths())
//                .components(new Components().addSchemas().)
                .info(new Info().title("Cinema Application OpenApi").version("v1").description("Cinema applccation API documentation"));

    }

}
