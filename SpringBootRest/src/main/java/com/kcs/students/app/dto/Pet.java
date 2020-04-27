package com.kcs.students.app.dto;

public class Pet {
    private String name;
    private int age;
    private String Type;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        Type = type;
    }
    public Pet(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
