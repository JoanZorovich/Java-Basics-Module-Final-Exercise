package org.globantUniversity.data;

import java.util.ArrayList;

public class University {
     private ArrayList<Student> studentList;
     private ArrayList<Teacher> teacherList;
     private ArrayList<Subject> subjectList;

     public University() {
          this.studentList = new ArrayList<>();
          this.teacherList = new ArrayList<>();
          this.subjectList = new ArrayList<>();
     }

     public Student registerStudent (String name, int age, int identityCard){
          Student student = new Student(name,age,identityCard);
          studentList.add(student);
          return student;
     }

     public void addStudentToSubject(Student student, String subjectName){
          Subject currentSubject = searchASubject(subjectName);
          currentSubject.setRegisteredStudentsList(student);
          student.setStudentSubjectsList(currentSubject);
     }

     public Subject searchASubject(String subjectName){
          Subject locatedSubject = new Subject();
          for (Subject trySubject : this.subjectList){
               if(trySubject.isARegisteredSubject(subjectName)){
                    locatedSubject = trySubject;
               }
          }
          return locatedSubject;
     }

     public void registerTeacher (Teacher teacher){
          teacherList.add(teacher);
     }
     public void registerSubject (Subject subject){
          subjectList.add(subject);
     }

     public int getTeacherAmount(){
          return teacherList.size();
     }
     public Teacher getTeacherByIndex(int index) {
          return teacherList.get(index);
     }


     public int getStudentsAmount(){
          return studentList.size();
     }
     public Student getStudentByIndex(int index) {
          return studentList.get(index);
     }


     public int getSubjectAmount(){
          return studentList.size();
     }

     public Subject getSubjectByIndex(int index) {
          return subjectList.get(index);
     }

}
