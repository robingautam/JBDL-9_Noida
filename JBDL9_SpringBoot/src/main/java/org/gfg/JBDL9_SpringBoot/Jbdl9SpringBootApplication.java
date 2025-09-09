package org.gfg.JBDL9_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletAutoConfiguration;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication(exclude = {DispatcherServletAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "org.gfg")
public class Jbdl9SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jbdl9SpringBootApplication.class, args);
	}

	/*@Bean
	public DispatcherServlet dispatcherServlet(){
		return new DispatcherServlet();
	}*/

}
