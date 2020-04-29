package com.codepig.spy;

import com.codepig.spy.config.SpringConfiguration;
import com.codepig.spy.service.MarryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
public class MarryTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MarryServiceImpl marryService = applicationContext.getBean("marryService", MarryServiceImpl.class);
        marryService.transfer("aaa","bbb",100f);
    }



}
