package to.gak.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysqlConfig {
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://ec2-54-64-130-193.ap-northeast-1.compute.amazonaws.com:3306/totec");
		dataSource.setUsername("sasuke");
		dataSource.setPassword("sasuke");
		dataSource.setInitialSize(100);
		dataSource.setMaxIdle(100);
		dataSource.setMinIdle(100);
		return dataSource;
	}
}
