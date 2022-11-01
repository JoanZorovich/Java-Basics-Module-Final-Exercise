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

     public Student getStudentById(int index) {
          return this.studentList.get(index);
     }

     public Teacher getTeacherById(int index) {
          return this.teacherList.get(index);
     }

     public Subject getSubjectById(int index) {
          return this.subjectList.get(index);
     }

     public Student registerStudent (String name, int age, int identityCard){
          Student student = new Student(name,age,identityCard);
          this.studentList.add(student);
          return student;
     }

     public Subject createSubject (String subjectName, int classroom, Teacher subjectTeacher){
          Subject subject = new Subject(subjectName, classroom, subjectTeacher);
          this.subjectList.add(subject);
          return subject;
     }

     public void addStudentToSubject(Student student, Subject subject){
          subject.setRegisteredStudentsList(student);
          student.setStudentSubjectsList(subject);
     }

     public void registerTeacher (Teacher teacher){
          teacherList.add(teacher);
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


     public int getTeacherAmount(){
          return this.teacherList.size();
     }
     public Teacher getTeacherByIndex(int index) {
          return this.teacherList.get(index);
     }

     public int getStudentsAmount(){
          return this.studentList.size();
     }
     public Student getStudentByIndex(int index) {
          return this.studentList.get(index);
     }


     public int getSubjectAmount(){
          return this.subjectList.size();
     }
     public Subject getSubjectByIndex(int index) {
          return this.subjectList.get(index);
     }

     public String getSubjectDetailedInformation(Subject subject){
          return subject.getInformationOfSubject();
     }

     public String getStudentDetailedInformation(Student student){
          return student.getInformationOfStudent();
     }



     public Subject getStudentSubjectsById(Student student, int index){
          return student.getStudentSubjectsListById(index);
     }

     public int getStudentSubjectsAmount(Student student){
          return student.getStudentSubjectsListAmount();
     }

     public Student getRegisteredStudentsById(Subject subject, int index){
          return subject.getRegisteredStudentsListById(index);
     }

     public int getRegisteredStudentsAmount(Subject subject){
          return subject.getRegisteredStudentsListAmount();
     }

}
