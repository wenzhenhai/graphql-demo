package com.beautifulxixi.graphql.config;

import com.beautifulxixi.graphql.enums.SexEnum;
import com.coxautodev.graphql.tools.SchemaParserDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    @Bean
    public SchemaParserDictionary schemaParserDictionary() {
        return new SchemaParserDictionary().add(SexEnum.class);
    }

}
