package org.gfg.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycleconfig.xml");

        DBOperation dbOperation = applicationContext.getBean("dboperation", DBOperation.class);
        DBOperation dbOperation2 = applicationContext.getBean("dboperation", DBOperation.class);
        applicationContext.registerShutdownHook();
        System.out.println(dbOperation);
        System.out.println(dbOperation2);
    }
}
