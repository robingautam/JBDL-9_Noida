package org.gfg.autowiring;

public class Department {

    String name;
    String function;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", function='" + function + '\'' +
                '}';
    }
}
