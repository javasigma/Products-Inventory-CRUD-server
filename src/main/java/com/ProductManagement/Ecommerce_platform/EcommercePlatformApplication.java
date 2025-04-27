package com.ProductManagement.Ecommerce_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommercePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePlatformApplication.class, args);
	}

}

/*
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/ecom_drog
spring.datasource.username=root
spring.datasource.password=Mysql579@
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate/JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true*/