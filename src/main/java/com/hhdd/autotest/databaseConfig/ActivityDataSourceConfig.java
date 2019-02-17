package com.hhdd.autotest.databaseConfig;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.activation.DataSource;

/**
 * activity数据库配置表
 * Created by Administrator on 2019/1/9.
 */
@Configuration
@MapperScan(basePackages = "com.hhdd.autotest.repositories.mapper",sqlSessionFactoryRef = "orgSqlSessionFactory")
public class ActivityDataSourceConfig {
//    @Primary
//    @Bean(name = "activityDataSource")
//    @ConfigurationProperties("spring.datasource.activity")
//    public DataSource masterDataSource(){
//        return (DataSource) DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "orgSqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("activityDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources("classpath:mapping/org/*.xml"));
//        return sessionFactoryBean.getObject();
//    }


}
