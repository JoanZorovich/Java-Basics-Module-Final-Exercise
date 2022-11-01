package org.globantUniversity.data;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int identityCard;
    private ArrayList<Subject> studentSubjectsList;


    public Student(){};

    public Student(String name, int age, int identityCard) {
        this.name = name;
        this.age = age;
        this.identityCard=identityCard;
        this.studentSubjectsList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public Subject getStudentSubjectsListById(int index) {
        return this.studentSubjectsList.get(index);
    }

    public int getStudentSubjectsListAmount(){
        return this.studentSubjectsList.size();
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

    public String getInformationOfStudent(){
        return
                "************* Subject Information ************ " +
                        "\n- ID: " + this.identityCard +
                        "\n- Name: " + this.name +
                        "\n- Age: " + this.age +
                        "\n*** These are the subjects in which the student is enrolled ***";
    }

    @Override
    public String toString() {
        return String.format("|%20s|%20s|%20s|",identityCard,name,age);
    }
}

