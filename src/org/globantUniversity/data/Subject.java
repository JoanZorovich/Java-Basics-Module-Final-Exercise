package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String subjectName;
    private int classroom;
    private ArrayList<Student> registeredStudentsList;
    private Teacher subjectTeacher;

    private static int counter = 1111;

    public Subject(){}

    public Subject(String subjectName, int classroom, Teacher subjectTeacher) {
        this.id= counter;
        this.subjectName = subjectName;
        this.classroom = classroom;
        this.registeredStudentsList = new ArrayList<>();
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

    public boolean isARegisteredSubject(int subjectID){
        boolean isRegisteredSubject = false;
        if(this.id == subjectID){
            isRegisteredSubject = true;
        }
        return isRegisteredSubject;
    }

    @Override
    public String toString() {
        return
                "************* Subject Information ************ " +
                "\n- ID: " + id +
                "\n- SubjectName: " + subjectName +
                "\n- Classroom: " + classroom + "\n- Teacher: " + subjectTeacher.getName() +
                "\n- registeredStudentsList=" + registeredStudentsList +
                "\n**************************************";
    }
}
