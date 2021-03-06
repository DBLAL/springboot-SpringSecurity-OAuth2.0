package com.custom.config;

import com.alibaba.druid.pool.DruidDataSource;  
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;  

@Configuration  
@EnableTransactionManagement  
/**  
 * Druid的DataResource配置类  
 */  
public class DruidDataSourceConfig{  

	@Value("${spring.datasource.url}")    
	private String dbUrl;    

	@Value("${spring.datasource.username}")    
	private String username;    

	@Value("${spring.datasource.password}")    
	private String password;    

	@Value("${spring.datasource.driver-class-name}")    
	private String driverClassName;    

	@Value("${spring.datasource.initialSize}")    
	private int initialSize;    

	@Value("${spring.datasource.minIdle}")    
	private int minIdle;    

	@Value("${spring.datasource.maxActive}")    
	private int maxActive;    

	@Value("${spring.datasource.maxWait}")    
	private int maxWait;    

	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")    
	private int timeBetweenEvictionRunsMillis;    

	@Value("${spring.datasource.minEvictableIdleTimeMillis}")    
	private int minEvictableIdleTimeMillis;    

	@Value("${spring.datasource.validationQuery}")    
	private String validationQuery;    

	@Value("${spring.datasource.testWhileIdle}")    
	private boolean testWhileIdle;    

	@Value("${spring.datasource.testOnBorrow}")    
	private boolean testOnBorrow;    

	@Value("${spring.datasource.testOnReturn}")    
	private boolean testOnReturn;    

	@Value("${spring.datasource.poolPreparedStatements}")    
	private boolean poolPreparedStatements;    

	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")    
	private int maxPoolPreparedStatementPerConnectionSize;    

	@Value("{spring.datasource.connectionProperties}")    
	private String connectionProperties; 

	@Primary
	@Bean  
	public DataSource dataSource() {  
		DruidDataSource datasource = new DruidDataSource();  
		datasource.setUrl(dbUrl);  
		datasource.setDriverClassName(driverClassName);  
		datasource.setUsername(username);  
		datasource.setPassword(password);  
		datasource.setInitialSize(initialSize);  
		datasource.setMinIdle(minIdle);  
		datasource.setMaxWait(maxWait);  
		datasource.setMaxActive(maxActive);  
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);  
		return datasource;  
	}  


}  