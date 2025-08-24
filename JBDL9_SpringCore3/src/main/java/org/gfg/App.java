package org.gfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Employee employee = applicationContext.getBean("e1", Employee.class);

        System.out.println(employee);
    }
}
