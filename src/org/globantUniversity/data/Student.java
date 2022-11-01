package org.globantUniversity.data;

import java.util.ArrayList;

/**
 * create and consult information of a Student
 */
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

    /**
     * getStudentSubjectsListById and getStudentSubjectsListAmount allow all the subjects
     * in which a student has registered to be displayed in an orderly manner
     * @param index
     * @return a Subject and int
     */
    public Subject getStudentSubjectsListById(int index) {
        return this.studentSubjectsList.get(index);
    }

    public int getStudentSubjectsListAmount(){
        return this.studentSubjectsList.size();
    }

    /**
     *This method receives a subject entered by console, enrolled by a specific
     * student and stores it in an arrayList callled studentSubjectsList
     * @param subject
     */
    public void setStudentSubjectsList(Subject subject) {
        this.studentSubjectsList.add(subject);
    }

    /**
     *Validate if a Student has already been created
     * @param identityCard input data from console
     * @return true if the Student is registered, false if not
     */
    public boolean isARegisteredStudent(int identityCard){
        boolean isRegisteredStudent = false;
        if(this.identityCard == identityCard){
            isRegisteredStudent = true;
        }
        return isRegisteredStudent;
    }

    /**
     *Helps display information in an orderly and clear way
     * @return String with detailed information on a student
     */
    public String getInformationOfStudent(){
        return
                "************* Student Information ************ " +
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

