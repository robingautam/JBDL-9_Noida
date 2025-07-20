package accessmodifier;

public class Person {
    int id; // Its a default access modifier, can be used within a package not outside the package
    public String name;  // It can be use anywhere
    public String email; // It can be use anywhere
    private int age; // It can be use within the class, not outside the class
    protected String wallet; // It can be used within the package only, outside the package can be access through the inheritance


}
