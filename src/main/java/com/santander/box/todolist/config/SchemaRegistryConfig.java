package com.santander.box.todolist.config;

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
public class SchemaRegistryConfig {

    @Value("${schemaRegistry.schemaRegistryUrl}")
    private String schemaRegistryUrl;

    @Autowired
    private Environment env;

    private CachedSchemaRegistryClient schemaRegistryClient;

    @PostConstruct
    public void initialize() {
        schemaRegistryClient =  new CachedSchemaRegistryClient(schemaRegistryUrl,1000);
    }

    public CachedSchemaRegistryClient getSchemaRegistryClient() {
        return schemaRegistryClient;
    }

}
