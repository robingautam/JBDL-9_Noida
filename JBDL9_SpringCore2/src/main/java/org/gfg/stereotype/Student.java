package org.gfg.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

    @Value("1")
    int id;
    @Value("Robin")
    String name;
    @Value("robin@gmail.com")
    String email;

    @Autowired
         //   @Qualifier("marksBasedGrading")
    GradingStrategy gradingStrategy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GradingStrategy getGradingStrategy() {
        return gradingStrategy;
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gradingStrategy=" + gradingStrategy +
                '}';
    }
}
