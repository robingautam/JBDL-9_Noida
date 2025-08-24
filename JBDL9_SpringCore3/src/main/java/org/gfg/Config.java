package org.gfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.gfg")
public class Config {

    @Bean(name = {"e","e1"})
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Robin");
        employee.setEmail("robin@gmail.com");
        return employee;
    }
}
