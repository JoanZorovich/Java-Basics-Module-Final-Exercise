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

    public String getSubjectName() {
        return this.subjectName;
    }

    public Student getRegisteredStudentsListById(int index) {
        return this.registeredStudentsList.get(index);
    }

    public int getRegisteredStudentsListAmount(){
        return this.registeredStudentsList.size();
    }



    public void setRegisteredStudentsList(Student student) {
       this.registeredStudentsList.add(student);
    }


    public boolean isARegisteredSubject(int subjectID){
        boolean isRegisteredSubject = false;
        if(this.id == subjectID){
            isRegisteredSubject = true;
        }
        return isRegisteredSubject;
    }

    public String getInformationOfSubject(){
        return
                "************* Subject Information ************ " +
                        "\n- ID: " + this.id +
                        "\n- SubjectName: " + this.subjectName +
                        "\n- Classroom: " + this.classroom + "\n- Teacher: " + this.subjectTeacher.getName() +
                        "\n*** These are the students enrolled ***";
    }

    @Override
    public String toString() {return String.format("|%20d|%30s|%20s|",id,subjectName,classroom);}
    }

