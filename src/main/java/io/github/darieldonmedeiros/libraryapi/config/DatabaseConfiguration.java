package io.github.darieldonmedeiros.libraryapi.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driver-class-name}")
    String driver;

    // Implementação básica de Database (não otimizado para utilizar em produção)
//    @Bean
    public DataSource dataSource (){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driver);
        return ds;
    }

    // Por padrão o Spring Boot utiliza o Hikari
    // https://github.com/brettwooldridge/HikariCP
    @Bean
    public DataSource hikariDataSource(){
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);

        // Define um valor mãximo para o pool de conexões
        config.setMaximumPoolSize(10);
        // Tamanho inicial do pool de conexões
        config.setMinimumIdle(1);
        // O nome do pool de conexões
        config.setPoolName("library-db-pool");
        // 600 mil ms -> 10 min
        config.setMaxLifetime(600000);
        // Timeout para conseguir uma conexão
        config.setConnectionTimeout(100000);
        // query de teste
        config.setConnectionTestQuery("select 1");

        return new HikariDataSource(config);
    }
}
