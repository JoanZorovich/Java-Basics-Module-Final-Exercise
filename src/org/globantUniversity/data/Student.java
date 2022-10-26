package org.globantUniversity.data;

public class Student {
    private String name;
    private int age;
    private int id;
    static int counter;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        counter ++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}

