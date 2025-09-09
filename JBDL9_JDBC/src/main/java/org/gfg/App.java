package org.gfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

     //  int rows = jdbcTemplate.update("INSERT INTO student (id, name, email) values (?,?,?)", 1, "Robin", "robin@gmail.com");
      //  int rows  =  jdbcTemplate.update("UPDATE student set name=? where id=?", "Kajal", 1);
      //  System.out.println("Updated rows: "+rows);

    //  Student student =  jdbcTemplate.queryForObject("SELECT * FROM student where id=1", new StudentRowMapper());
       int rows =  jdbcTemplate.update("delete from student");
       // System.out.println(student);

        System.out.println("Deleted rows: "+rows);
    }
}
