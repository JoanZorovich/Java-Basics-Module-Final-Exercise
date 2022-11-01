package org.globantUniversity.data;

import java.util.ArrayList;

/**
 * create and consult information of a Subject
 */
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

    /**
     * getRegisteredStudentsListById and getRegisteredStudentsListAmount allow all students who have
     * enrolled for a particular subject to be displayed in an orderly manner
     * @param index
     * @return Student and int
     */
    public Student getRegisteredStudentsListById(int index) {
        return this.registeredStudentsList.get(index);
    }

    public int getRegisteredStudentsListAmount(){
        return this.registeredStudentsList.size();
    }


    /**
     *This method receives a student entered by console, to be registered in a specific subject,
     * saving it in the arrayList registeredStudentsList
     * @param student
     */
    public void setRegisteredStudentsList(Student student) {
       this.registeredStudentsList.add(student);
    }

    /**
     * Validate if a Subject has already been created
     * @param subjectID input data from console
     * @return true if the Subject has already been created, false if it has not
     */

    public boolean isARegisteredSubject(int subjectID){
        boolean isRegisteredSubject = false;
        if(this.id == subjectID){
            isRegisteredSubject = true;
        }
        return isRegisteredSubject;
    }

    /**
     * Helps display information in an orderly and clear way
     * @return String with detailed information on a subject
     */
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

