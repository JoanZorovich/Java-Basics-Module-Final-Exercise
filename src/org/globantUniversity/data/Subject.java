package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String subjectName;
    private int classroom;
    private ArrayList<Student> studentsList;
    private Teacher subjectTeacher;

    private static int counter = 1010;

    public Subject(String subjectName, int classroom, ArrayList<Student> studentsList, Teacher subjectTeacher) {
        this.id= counter;
        this.subjectName = subjectName;
        this.classroom = classroom;
        this.studentsList = studentsList;
        this.subjectTeacher = subjectTeacher;
        counter ++;
    }
}
