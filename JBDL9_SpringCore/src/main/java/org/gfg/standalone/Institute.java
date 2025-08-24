package org.gfg.standalone;

import java.util.List;

public class Institute {

    private String name;
    List<String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
