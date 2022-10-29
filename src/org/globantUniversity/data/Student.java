package org.globantUniversity.data;

public class Student {
    private String name;
    private int age;
    private int identityCard;
    private int id;
    static int counter = 1;

    public Student(String name, int age, int identityCard) {
        this.name = name;
        this.age = age;
        this.identityCard=identityCard;
        this.id = counter;
        counter ++;
    }

    @Override
    public String toString() {
        return String.format("|%20d|%20d|%20s|%20d|",id,identityCard,name,age);

    }
}

