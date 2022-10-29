package org.globantUniversity.persistence;

import org.globantUniversity.data.*;

import java.util.ArrayList;

public class DataInitializer {

    public static  University loadUniversity(){
        University globantUniversity = new University();
        loadStudentsIntoUniversity(globantUniversity);
        loadSubjectInToUniversity(globantUniversity);
        loadTeachersIntoUniversity(globantUniversity);

        return globantUniversity;
    }
    public static void loadStudentsIntoUniversity(University university){
        Student student1= new Student("Ines Perado", 20, 1010179026);
        Student student2= new Student("Leo Diario", 18, 1010179027);
        Student student3= new Student("Elvis Teck", 19, 1010179028);
        Student student4= new Student("Helen Chufle", 23, 1010179029);
        Student student5= new Student("Aitor Menta", 25, 1010179030);
        Student student6= new Student("Elena Nito", 21, 1010179031);

        university.registerStudent(student1);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);
        university.registerStudent(student5);
        university.registerStudent(student6);

    }
    public static void loadTeachersIntoUniversity(University university){
        Teacher teacher1 = new FullTimeTeacher(1010178020, "Felipe Jimenez", 3);
        Teacher teacher2 = new PartTimeTeacher(1010178021, "Juan Castiblanco", 20);

        university.registerTeacher(teacher1);
        university.registerTeacher(teacher2);


    }
    public static void loadSubjectInToUniversity(University university){
        ArrayList<Student> subject1Students = new ArrayList<>();
        Teacher teacher2 = new PartTimeTeacher(1010178021, "Felipe Jimenez", 20);
        Subject subject1 = new Subject("math 1", 12020, subject1Students, teacher2);
        Subject subject2 = new Subject("math 2", 12021, subject1Students, teacher2);
        Subject subject3 = new Subject("math 3", 12022, subject1Students, teacher2);
        Subject subject4 = new Subject("math 4", 12023, subject1Students, teacher2);

        university.registerSubject(subject1);
        university.registerSubject(subject2);
        university.registerSubject(subject3);
        university.registerSubject(subject4);

    }

}


