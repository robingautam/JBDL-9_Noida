package org.gfg.standalone;

import java.util.List;

public class OnlineCoaching {

    List<String> onlineCourses;


    public List<String> getOnlineCourses() {
        return onlineCourses;
    }

    public void setOnlineCourses(List<String> onlineCourses) {
        this.onlineCourses = onlineCourses;
    }

    @Override
    public String toString() {
        return "OnlineCoaching{" +
                "onlineCourses=" + onlineCourses +
                '}';
    }
}
