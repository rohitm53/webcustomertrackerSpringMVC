package com.rohit.udemy.configuration;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	@Autowired
	private ApplicationContext context;
	
//	@Bean
//	public DataSource getdatasource () {
//		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//		try {
//			comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
//			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/web_customer_tracker");
//			comboPooledDataSource.setUser("springstudent");
//			comboPooledDataSource.setPassword("springstudent");
//			comboPooledDataSource.setMaxPoolSize(20);
//			comboPooledDataSource.setMinPoolSize(5);
//			comboPooledDataSource.setMaxIdleTime(3000);
//		} catch (PropertyVetoException e) {
//			e.printStackTrace();
//		}
//		return comboPooledDataSource;
//	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setPackagesToScan("com.rohit.udemy");
		return factoryBean;
	}
	
	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(getSessionFactory().getObject());
		return hibernateTransactionManager;
	}

}
