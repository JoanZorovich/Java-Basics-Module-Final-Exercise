package org.globantUniversity.view;

import org.globantUniversity.data.Student;
import org.globantUniversity.data.Subject;
import org.globantUniversity.data.Teacher;
import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University globantUniversity = DataInitializer.loadUniversity();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the university of the future  - GLOBANT UNIVERSITY!");

        int option;

        do{
            System.out.println("*** Please choose a type of menu ***" +
                    "\n1. Subject menu" +
                    "\n2. Student menu" +
                    "\n3. Teacher menu" +
                    "\n4. Exit");
            option= sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Subject Menu *** ");
                    subjectMenu(globantUniversity);
                    break;

                case 2:
                    System.out.println("*** Student Menu *** ");
                    studentMenu(globantUniversity);
                    break;

                case 3:
                    System.out.println("*** Teacher Menu *** ");
                    teacherMenu(globantUniversity);
                    break;

                case 4:
                    System.out.println("You have exited the program.\n Have a good day!");
                    break;

                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }

    public static void subjectMenu(University currentUniversity){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Please choose an option ***" +
                    "\n1. Create a new Subject" +
                    "\n2. Display Subject List" +
                    "\n3. Display a specific subject with detailed information" +
                    "\n4. Back to previous menu");
            option= sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Please enter the following subject information *** ");
                    System.out.println("Subject name: ");
                    String subjectName = sc.next();
                    System.out.println("Classroom : ");
                    int classroom = sc.nextInt();
                    System.out.println("Add a teacher : ");
                    System.out.println("Type the teacher ID card :");
                    int teacherIdCard = sc.nextInt();
                    Teacher currentTeacher = currentUniversity.searchATeacher(teacherIdCard);

                    if(currentTeacher.getName()== null){
                        System.out.println("Please validate the teacher ID card and try the registration again");
                    }else{
                        System.out.println("Add a Student :");
                        System.out.println("Type the student ID card :");
                        int studentIdCard = sc.nextInt();
                        Student currentStudent = currentUniversity.searchAStudent(studentIdCard);
                        if (currentStudent.getName()==null){
                            System.out.println("Please validate the Student ID card and try the registration again");
                        }else{
                            currentUniversity.createSubject(subjectName,classroom,currentTeacher,currentStudent);
                            System.out.println(subjectName +
                                    " has been successfully created in the University!!!");
                        }
                    }

                    break;
                case 2:
                    System.out.println("********** Subject List *************");
                    System.out.printf("|%20s|%20s|%20s|%n", "ID", "NAME", "CLASSROOM");
                    displaySubjectList(currentUniversity);

                    break;
                case 3:
                    System.out.println("*** Please enter the following subject information *** ");
                    System.out.println("Subject ID :");
                    int subjectID = sc.nextInt();
                    Subject currentSubject = currentUniversity.searchASubject(subjectID);
                    if (currentSubject.getSubjectName()==null){
                        System.out.println("Please validate the Subject ID and try again");
                    }else{
                        System.out.println(currentUniversity.getSubjectDetailedInformation(currentSubject));

                    }
                    break;

                case 4:
                    System.out.println("This is the previous menu !!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }

    public static void studentMenu(University currentUniversity){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Please choose an option ***" +
                    "\n1. Create a new Student and enroll him/her in a subject" +
                    "\n2. Display student List" +
                    "\n3. Display a specific student with detailed information" +
                    "\n4. Back to previous menu");
            option= sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Please enter the following student information *** ");
                    System.out.println("Student ID card : ");
                    int identityCard = sc.nextInt();
                    registerAStudent(currentUniversity,identityCard);
                    break;

                case 2:
                    System.out.println("********** Student List *************");
                    System.out.printf("|%20s|%20s|%20s|%20s|%n", "ID", "NAME", "IDENTITY CARD", "AGE");
                    displayStudentList(currentUniversity);
                    System.out.println("*************************************");
                    break;

                case 3:
                    break;
                case 4:
                    System.out.println("This is the previous menu !!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }

    public static void teacherMenu(University currentUniversity){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Please choose an option ***" +
                    "\n1. Create a new teacher" +
                    "\n2. Display teacher List" +
                    "\n3. Display a specific teacher with detailed information" +
                    "\n4. Back to previous menu");
            option= sc.nextInt();

            switch (option){
                case 1:
                    break;
                case 2:
                    System.out.println("**********  Teacher List  *************");
                    System.out.printf("|%20s|%20s|%20s|%20s|%n", "ID", "ID CARD", "NAME", "TOTAL SALARY");
                    displayTeacherList(currentUniversity);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("This is the previous menu !!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }




    public static void displaySubjectList(University university){
        if (university.getSubjectAmount()==0){
            System.out.println("Subject list is empty");
        }else{
            for (int i = 0; i<university.getSubjectAmount(); i++){

                Subject currentSubject = university.getSubjectByIndex(i);
                System.out.printf("|%20s|%20s|%20s|%n", currentSubject.getId(),
                        currentSubject.getSubjectName(), currentSubject.getClassroom());
            }
        }
    }



    public static void registerAStudent(University university, int identityCard){
        Student student = university.searchAStudent(identityCard);
        if(student.getName() != null){
            System.out.println("This student is already registered in the university");
        }else {
            Scanner sc= new Scanner(System.in);
            System.out.println("Student full name : ");
            String name = sc.nextLine();
            System.out.println("Student age: ");
            int age = sc.nextInt();
            Student currentStudent = university.registerStudent(name,age,identityCard);
            System.out.println(currentStudent.getName() + "has successfully enrolled in the University," +
                    "\nNow, please register the student in a subject");
            sc=new Scanner(System.in);
            System.out.println("Enter the subject ID");
            int subjectID = sc.nextInt();
            Subject currentSubject = university.searchASubject(subjectID);

            if(currentSubject.getSubjectName()==null){
                System.out.println("no subject with that name was found"+
                        "\nPlease verify the subject name and try again");
            }else {
                university.addStudentToSubject(currentStudent,currentSubject);
                System.out.println(currentStudent.getName() + " has successfully enrolled in the University" +
                        "\nand registered for " + currentSubject.getSubjectName());
            }
        }
        displayStudentList(university);
    }
    public static void displayStudentList(University university){
        if (university.getStudentsAmount()==0){
            System.out.println("Student list is empty");
        }else{
            for (int i = 0; i<university.getStudentsAmount(); i++){
                Student currentStudent =university.getStudentByIndex(i);
                System.out.printf("|%20s|%20s|%20s|%20s|%n", currentStudent.getId(),
                        currentStudent.getName(),currentStudent.getIdentityCard(),currentStudent.getAge() );
            }
        }

    }



    public static void displayTeacherList(University university){
        if (university.getTeacherAmount()==0){
            System.out.println("Teacher list is empty");
        }else{
            for (int i = 0; i<university.getTeacherAmount(); i++){
                System.out.println(university.getTeacherByIndex(i));
            }
        }
    }

}

