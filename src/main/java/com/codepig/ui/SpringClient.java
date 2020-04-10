package com.codepig.ui;

import com.codepig.mapper.AccountMapper;
import com.codepig.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

    /**
     * 我们之前的getBean方法是获取工厂中的map对象
     * 现在我们也是获取一个Spring的IOC核心容器，并根据id获取对象
     *
     * Application vs BeanFactory
     */

    public static void main(String[] args) {
        //1.获取核心容器对象（也就是象征map的那个对象）
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        AccountService accountService = (AccountService) ac.getBean("accountService2");
        AccountMapper accountMapper =ac.getBean("accountMapper",AccountMapper.class);

        accountService.saveAccount();
        System.out.println(accountService);
        System.out.println(accountMapper);

        //BeanFactory factory new XmlBeanFactory();
    }
}
