package com.hu.gmall.pojo;

public class Class {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
