package com.codepig.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Step:
 * 1.配置文件
 * 2.读取配置文件，反射创建对象
 */
public class BeanFactory {

    /**
     * 定义一个properties对象
     * props
     */
    private static Properties props;

    /**
     * 定义一个Map，用于存放我们要创建的对象。我们称之为容器
     */
    private static Map<String,Object> beans;

    //使用静态代码块为Properties对象赋值
    static {
        try{
            //实例化对象
            props = new Properties();
            //获取properties文件的流对象(这里不要用File输入流，因为无论是相对路径还是绝对路径都会出错)
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据每个key获取value值，也即beanPath
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);//key是配置文件中的key，而value已经是反射创建的对象了
            }

        }catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 如果是这种立即加载的方式，那么我们取bean对象的方式就不是这样了
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

    /**
     *  根据Bean的名称获取bean对象
     * @param beanName 要通过getBean方法获取哪一个bean呢？
     * @return Object方便扩展，不写死
     */
    /*public static Object getBean(String beanName) {
        Object bean = null;
        try{
            String beanPath = props.getProperty(beanName);
            bean = Class.forName(beanPath).newInstance();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{

        }

        return bean;
    }*/
}
