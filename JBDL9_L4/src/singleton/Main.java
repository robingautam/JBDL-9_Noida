package singleton;

public class Main {

    public static void main(String[] args) {
        Student s = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s);
        System.out.println(s2);
    }
}
