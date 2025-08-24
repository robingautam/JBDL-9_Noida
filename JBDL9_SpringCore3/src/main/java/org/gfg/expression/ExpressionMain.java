package org.gfg.expression;

import org.gfg.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExpressionMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

      Student student =  applicationContext.getBean("student", Student.class);

        System.out.println(student);
    }
}
