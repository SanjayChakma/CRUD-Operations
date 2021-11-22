package com.Group_1.Artifact_1.Config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ConfigurationProperties(prefix = "app.datasource")
public class DatasourceConfig {

	private String username;
	private String password;
	private String url;
	private String driver;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	@Bean
	public DataSource datasource()
	{
		HikariDataSource ds= new HikariDataSource();
		ds.setDataSourceClassName(this.getDriver());
		ds.setJdbcUrl(this.getUrl());
		ds.setPassword(this.getPassword());
		ds.setUsername(this.getUsername());
		return ds;
	}
	
	
	/*@Bean
	public DataSourceTransactionManager datasourceTransactionManager()
	{
		return new DataSourceTransactionManager(datasource());
		
	}*/
}
