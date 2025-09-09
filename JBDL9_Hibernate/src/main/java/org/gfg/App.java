package org.gfg;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Student student = new Student();
        student.setId(1);
        student.setName("Robin");
        student.setEmail("robin@gmail.com");

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(student);

        session.getTransaction().commit();

        System.out.println("data insrted");
    }
}
