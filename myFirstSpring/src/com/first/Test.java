package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("resource/spring-config.xml");
        Helloworld hello= (Helloworld)ctx.getBean("hello");
        hello.showName();
    }
}
