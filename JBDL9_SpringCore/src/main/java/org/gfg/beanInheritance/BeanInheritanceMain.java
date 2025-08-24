package org.gfg.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Child child = (Child) applicationContext.getBean("c2");

        System.out.println(child);

    }
}
