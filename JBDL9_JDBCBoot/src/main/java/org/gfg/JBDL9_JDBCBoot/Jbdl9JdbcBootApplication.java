package org.gfg.JBDL9_JDBCBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Jbdl9JdbcBootApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;
	

	public static void main(String[] args) {
		SpringApplication.run(Jbdl9JdbcBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
		int rows = jdbcTemplate.update("insert into student values (?,?,?)", 1, "Robin", "robin@gmail.com");
		System.out.println("Rows: "+rows);
	}
}
