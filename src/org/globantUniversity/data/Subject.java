package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String subjectName;
    private int classroom;
    private ArrayList<Student> registeredStudentsList;
    private Teacher subjectTeacher;

    private static int counter = 0;

    public Subject(){}

    public Subject(String subjectName, int classroom, ArrayList<Student> studentsList, Teacher subjectTeacher) {
        this.id= counter;
        this.subjectName = subjectName;
        this.classroom = classroom;
        this.registeredStudentsList = studentsList;
        this.subjectTeacher = subjectTeacher;
        counter ++;
    }

    public int getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setRegisteredStudentsList(Student student) {
       this.registeredStudentsList.add(student);
    }

    public Teacher getSubjectTeacher() {
        return subjectTeacher;
    }

    public boolean isARegisteredSubject(String subjectName){
        boolean isRegisteredSubject = false;
        if(this.subjectName.equals(subjectName)){
            isRegisteredSubject = true;
        }
        return isRegisteredSubject;
    }
}
