package com.webapp.entity;

public class User {
    private int id;
    private String Name;
    private String email;
    private int age;

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
