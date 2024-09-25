package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Car car = applicationContext.getBean(Car.class);
        Car car2 = applicationContext.getBean(Car.class);
//        car.drive();


//        Objects created by the ApplicationContext are singleton in nature by default.---> but this can be changed using scope="prototype in xml
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());


//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//
//        Car car = factory.getBean(Car.class);           // here Car.class is the reflection api

        
    }
}
