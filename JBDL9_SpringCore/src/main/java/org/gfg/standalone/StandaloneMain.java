package org.gfg.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("standalone.xml");

       Institute institute = applicationContext.getBean("inst", Institute.class);

        System.out.println(institute);
    }
}
