package org.gfg.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    int id;
    String name;
    String email;
    List<String> friendList;
    Set<String> subject;
    Map<String,Integer> marks;

    Address address;

    Student (){}

    public List<String> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<String> friendList) {
        this.friendList = friendList;
    }

    public Student(int id, String name, String email){
        this.id = id;
        this.name =name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Insider the seter if ID");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Insider the seter if Name");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Insider the seter if EMAIL");
        this.email = email;
    }

    public Set<String> getSubject() {
        return subject;
    }

    public void setSubject(Set<String> subject) {
        this.subject = subject;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", friendList=" + friendList +
                ", subject=" + subject +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }
}
