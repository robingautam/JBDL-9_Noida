package Encapsulation;

public class Employee {

    private int id;
    private String name;
    private String email;
    int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            return;
        }
        this.age = age;
    }

    public void calculateAge(String dob){
        // convert dob to age
    }
}
