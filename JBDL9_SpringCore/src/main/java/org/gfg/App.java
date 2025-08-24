package org.gfg;


import org.gfg.model.Addition;
import org.gfg.model.Person;
import org.gfg.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // I will ask IOC container to give me student class object
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

       Student student = (Student) applicationContext.getBean("student");

        System.out.println(student);


   //     Addition addition = (Addition) applicationContext.getBean("add");

     //   System.out.println(addition);


     Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);
    }
}
