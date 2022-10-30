package org.globantUniversity.data;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private int identityCard;
    private ArrayList<Subject> studentSubjectsList;
    static int counter = 1;
    public Student(){};

    public Student(String name, int age, int identityCard) {
        this.name = name;
        this.age = age;
        this.identityCard=identityCard;
        this.id = counter;
        this.studentSubjectsList = new ArrayList<>();
        counter ++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public void setStudentSubjectsList(Subject subject) {
        this.studentSubjectsList.add(subject);
    }

    public boolean isARegisteredStudent(int indentityCard){
        boolean isRegisteredStudent = false;
        if(this.identityCard == indentityCard){
            isRegisteredStudent = true;
        }
        return isRegisteredStudent;
    }

    @Override
    public String toString() {
        return String.format("|%20d|%20d|%20s|%20d|",id,identityCard,name,age);

    }
}

