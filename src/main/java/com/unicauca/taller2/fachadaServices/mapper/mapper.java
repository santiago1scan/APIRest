package com.unicauca.taller2.fachadaServices.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapper {
    @Bean
    public ModelMapper ModelMapper(){
        return new  ModelMapper();
    }
}
