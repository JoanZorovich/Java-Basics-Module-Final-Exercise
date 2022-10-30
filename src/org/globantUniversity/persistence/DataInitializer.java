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
        university.registerStudent("Ines Perado", 20, 1010179026);
        university.registerStudent("Leo Diario", 18, 1010179027);
        university.registerStudent("Elvis Teck", 19, 1010179028);
        university.registerStudent("Helen Chufle", 23, 1010179029);
        university.registerStudent("Aitor Menta", 25, 1010179030);
        university.registerStudent("Elena Nito", 21, 1010179031);

    }
    public static void loadTeachersIntoUniversity(University university){
        Teacher teacher1 = new FullTimeTeacher(1010178020, "Felipe Jimenez", 3);
        Teacher teacher2 = new PartTimeTeacher(1010178021, "Juan Castiblanco", 20);

        university.registerTeacher(teacher1);
        university.registerTeacher(teacher2);


    }
    public static void loadSubjectInToUniversity(University university){
        ArrayList<Student> students = new ArrayList<>();
        Teacher teacher2 = new PartTimeTeacher(1010178021, "Felipe Jimenez", 20);
        Subject subject1 = new Subject("math 1", 12020, students, teacher2);
        Subject subject2 = new Subject("math 2", 12021, students, teacher2);
        Subject subject3 = new Subject("math 3", 12022, students, teacher2);
        Subject subject4 = new Subject("math 4", 12023, students, teacher2);

        university.registerSubject(subject1);
        university.registerSubject(subject2);
        university.registerSubject(subject3);
        university.registerSubject(subject4);

    }

}


