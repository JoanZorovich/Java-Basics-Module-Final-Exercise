package org.globantUniversity.data;

import java.util.ArrayList;

public class Student {
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
        this.studentSubjectsList = new ArrayList<>();
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

    public String getStudentSubjectsList() {
        return studentSubjectsList.toString();
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

    public boolean isARegisteredStudent(int identityCard){
        boolean isRegisteredStudent = false;
        if(this.identityCard == identityCard){
            isRegisteredStudent = true;
        }
        return isRegisteredStudent;
    }

    @Override
    public String toString() {
        return String.format("|%20s|%20s|%20s|",identityCard,name,age);
    }
}

