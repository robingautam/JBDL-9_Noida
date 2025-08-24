package org.gfg.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("#{89+1}")
    int marks;

    @Value("#{33==33 and 34==34}")
    boolean isPassed;

    @Value("#{collect.map['robin']}")
    String name;

    @Value("#{collect.list[0]}")
    String email;


    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", isPassed=" + isPassed +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
