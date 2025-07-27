package Collection;

import model.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternals {

    public static void main(String[] args) {
        Student student = new Student(1,"Robin","robin@gmail.com");
        Student student2 = new Student(2,"Akash","aakash@gmail.com");
        Student student3 = new Student(1,"Robin","robin@gmail.com");


        Map<Student, Integer> map = new HashMap<>();
        map.put(student,1);
        map.put(student2,2);
        map.put(student3,3);

        System.out.println(student.hashCode());
        System.out.println(student3.hashCode());

        System.out.println(map.size());
    }
}
