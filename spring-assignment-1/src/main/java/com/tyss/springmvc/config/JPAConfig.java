package com.tyss.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class JPAConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactory() {
		
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("employeePersistenceUnit");
		
		return factoryBean;
		
	}// End of getEntityManagerFactory()
	
}// End of class
