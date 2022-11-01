package org.globantUniversity.persistence;

import org.globantUniversity.data.*;

import java.util.ArrayList;

public class DataInitializer {

    public static  University loadUniversity(){
        University globantUniversity = new University();
        loadStudentsIntoUniversity(globantUniversity);
        loadTeachersIntoUniversity(globantUniversity);
        loadSubjectInToUniversity(globantUniversity);

        return globantUniversity;
    }
    public static void loadStudentsIntoUniversity(University university){
        university.registerStudent("Ines Perado", 20, 1010179026);
        university.registerStudent("Leo Diario", 18, 1010179027);
        university.registerStudent("Lisa Simpson", 19, 1010179028);
        university.registerStudent("Helen Chufle", 23, 1010179029);
        university.registerStudent("Aitor Menta", 25, 1010179030);
        university.registerStudent("Elena Nito", 21, 1010179031);
        university.registerStudent("Troy McClure",20,10102635);
        university.registerStudent("Milhouse Van Housen",22,10102636);
        university.registerStudent("Nelson Muntz",40,10102637);


    }
    public static void loadTeachersIntoUniversity(University university){
        Teacher teacher1 = new FullTimeTeacher(1010178020, "Felipe Jimenez", 12);
        Teacher teacher2 = new PartTimeTeacher(1010178021, "Juan Castiblanco", 20);
        Teacher teacher3 = new FullTimeTeacher(1010178085, "Elvis Teck", 8);
        Teacher teacher4 = new PartTimeTeacher(1010178070, "Edna Krabappel", 48);

        university.registerTeacher(teacher1);
        university.registerTeacher(teacher2);
        university.registerTeacher(teacher3);
        university.registerTeacher(teacher4);
    }
    public static void loadSubjectInToUniversity(University university){


        Student student1 = university.getStudentById(0);
        Student student2 = university.getStudentById(1);
        Student student3 = university.getStudentById(2);
        Student student4 = university.getStudentById(3);

        Teacher teacher1= university.getTeacherById(0);
        Teacher teacher2= university.getTeacherById(1);
        Teacher teacher3= university.getTeacherById(2);
        Teacher teacher4= university.getTeacherById(3);

        university.createSubject("Psychogenesis of laughter", 101122, teacher1);
        university.createSubject("Molecular gastronomy", 101123, teacher2);
        university.createSubject("Special math", 101124, teacher3);
        university.createSubject("Innovation and technology", 101125, teacher4);

        Subject subject1 = university.getSubjectById(0);
        Subject subject2 = university.getSubjectById(1);
        Subject subject3 = university.getSubjectById(2);
        Subject subject4 = university.getSubjectById(3);

        university.addStudentToSubject(student2,subject1);
        university.addStudentToSubject(student3,subject1);
        university.addStudentToSubject(student4,subject2);
        university.addStudentToSubject(student1,subject2);
        university.addStudentToSubject(student2,subject3);
        university.addStudentToSubject(student4,subject3);
        university.addStudentToSubject(student1,subject4);
        university.addStudentToSubject(student2,subject4);
    }

}


