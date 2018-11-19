package com.web.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class DataSouceConfig {
    @Bean(name="dataSource")    
	public DriverManagerDataSource dataSource()
        {
       DriverManagerDataSource driverMangerDataSource=new DriverManagerDataSource();
       driverMangerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
       driverMangerDataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:XE");
       driverMangerDataSource.setUsername("system");
       driverMangerDataSource.setPassword("hr");
       return driverMangerDataSource;
        }
	
	
}
