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
        Student student1 = new Student("Troy McClure",20,10102635);
        Student student2 = new Student("Milhouse Van Housen",22,10102636);
        Student student3 = new Student("Nelson Muntz",40,10102637);

        Teacher teacher1 = new FullTimeTeacher(1010178085, "Elvis Teck", 3);
        Teacher teacher2 = new PartTimeTeacher(1010178070, "Pepito Perez", 30);

        university.createSubject("math 1", 101122, teacher1,student1);
        university.createSubject("math 2", 101122, teacher2,student2);
        university.createSubject("math 3", 101122, teacher1,student3);
        university.createSubject("math 4", 101122, teacher2,student2);
    }

}


