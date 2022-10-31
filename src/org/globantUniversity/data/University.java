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

     public void createSubject (String subjectName, int classroom, Teacher subjectTeacher, Student student){
          Subject subject = new Subject(subjectName, classroom, subjectTeacher);
          subject.setRegisteredStudentsList(student);
          subjectList.add(subject);
     }

     public void addStudentToSubject(Student student, Subject subject){
          subject.setRegisteredStudentsList(student);
          student.setStudentSubjectsList(subject);
     }

     public Subject searchASubject(int subjectID){
          Subject locatedSubject = new Subject();
          for (Subject trySubject : this.subjectList){
               if(trySubject.isARegisteredSubject(subjectID)){
                    locatedSubject = trySubject;
               }
          }
          return locatedSubject;
     }
     public Student searchAStudent(int identityCard){
          Student locatedStudent=new Student();
          for (Student tryStudent : this.studentList){
               if(tryStudent.isARegisteredStudent(identityCard)){
                    locatedStudent = tryStudent;
               }
          }
          return locatedStudent;
     }

     public Teacher searchATeacher(int identityCard){
          Teacher locatedTeacher = new Teacher();
          for (Teacher tryTeacher : this.teacherList){
               if(tryTeacher.isARegisteredTeacher(identityCard)){
                    locatedTeacher = tryTeacher;
               }
          }
          return locatedTeacher;
     }

     public void registerTeacher (Teacher teacher){
          teacherList.add(teacher);
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
          return subjectList.size();
     }
     public Subject getSubjectByIndex(int index) {
          return subjectList.get(index);
     }

     public String getSubjectDetailedInformation(Subject subject){
          return subject.toString();
     }

}
