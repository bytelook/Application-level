package top.byteinfo.mybatisdatasources.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Description: druid配置类
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2020/8/18 08:12
 */
@Configuration
public class DataSourcesConfig {

    @Primary
    @Bean(name = "PrimaryDataSource")
    @ConfigurationProperties("spring.datasource.druid.primary")
    public DataSource first() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties("spring.datasource.druid.secondary")
    public DataSource second() {
        return DruidDataSourceBuilder.create().build();
    }

}