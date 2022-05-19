package com.cgi.client.config;

import com.cgi.client.service.SecretManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

@Profile("prod")
@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;

    @Autowired
    private SecretManagerService secretManagerService;

    @Bean
    public DataSource getDataSource() throws IOException {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        String password = getDatabasePassword();
        dataSourceBuilder.url(url + password);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }

    private String getDatabasePassword() throws IOException {
        return secretManagerService.accessSecretVersion("mysql-password", "latest");
    }
}

