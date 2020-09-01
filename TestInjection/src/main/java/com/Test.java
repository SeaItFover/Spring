package com;

import com.configuration.AppConfig;
import com.service.FirstService;
import com.service.IService;
import com.service.SecondService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springApplication.xml");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //System.out.println(ac);
        System.out.println(ac.getBean(IService.class));
    }
}
