package com.gohilumang.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.FileSystemXmlApplicationContext;


@Configuration
@ComponentScan(basePackages = "com.gohilumang.dao")
// @PropertySource(value = { "classpath:application.properties" })
public class getData {

    ApplicationContext ac;
    private static JdbcTemplate jt;

    public getData(){
        ac = new FileSystemXmlApplicationContext("one.xml");
        jt = (JdbcTemplate) ac.getBean("jdbcTemplates");
    }

    public static SqlRowSet get(String topic){
        SqlRowSet srs = jt.queryForRowSet("SELECT * FROM ( SELECT * FROM quizdata WHERE topic!=?) as qd ORDER BY RAND() LIMIT 5;", topic);
        System.out.println("Data Retrieved Successfully!!");
        return srs;
    }


}
