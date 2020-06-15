package com.pulkit.zipcodelookup.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class, basePackages = {
		"com.pulkit.*" })
@ComponentScan(basePackages = "com.pulkit.*")
@EntityScan(basePackages = "com.pulkit.*")
public class ZipCodeLookupUiApplication {
	public static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ZipCodeLookupUiApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Server Startup -main method");
		SpringApplication.run(ZipCodeLookupUiApplication.class, args);

	}
}
