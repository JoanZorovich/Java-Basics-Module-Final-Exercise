package org.globantUniversity.view;

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
            System.out.println("*** Please choose the type of user you are ***" +
                    "\n1. University Admin" +
                    "\n2. Student" +
                    "\n3. Teacher" +
                    "\n4. Exit");
            option= sc.nextInt();

            switch (option){
                case 1:
                    universityMenu(globantUniversity);
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    teacherMenu();
                    break;
                case 4:
                    System.out.println("You have exited the program.\n Have a good day!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }
    public static void universityMenu(University currentUniversity){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Pleas1e choose an option ***" +
                    "\n1. Add new Student" +
                    "\n2. Subject Menu" +
                    "\n3. Display Teacher List" +
                    "\n4. Back to previous menu");
            option= sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Please enter the following user information *** ");
                    System.out.println("Student ID : ");
                    int userID = sc.nextInt();
                    System.out.println("Student full name : ");
                    String name = sc.next();
                    System.out.println("Student: ");
                    String userName = sc.next();
                    System.out.println("Temporal password : ");
                    String password = sc.next();

                    break;
                case 2:
                    System.out.println("*** Subject Menu *** ");
                        subjectMenu();
                    break;
                case 3:
                    System.out.println("**********  Teacher List  *************");
                    System.out.printf("|%20s|%20s|%20s|%20s|%n", "ID", "ID CARD", "NAME", "TOTAL SALARY");
                    displayTeacherList(currentUniversity);

                case 4:
                    System.out.println("This is the previous menu !!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }

    public static void subjectMenu(){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Please choose an option ***" +
                    "\n1. Add new Subject" +
                    "\n2. Inquiry a Subject" +
                    "\n3. Display Subject List" +
                    "\n4. Back to previous menu");
            option= sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Please enter the following user information *** ");
                    System.out.println("Student ID : ");
                    int userID = sc.nextInt();
                    System.out.println("Student full name : ");
                    String name = sc.next();
                    System.out.println("Student: ");
                    String userName = sc.next();
                    System.out.println("Temporal password : ");
                    String password = sc.next();

                    break;
                case 2:
                    System.out.println("Consultar una materia");

                    break;
                case 3:
                    System.out.println("**********  Subject List  *************");
                    System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%n", "ID", "FULL NAME", "USER", "ACCOUNT NUMBER", "OPENING DATE", "BALANCE");

                    break;

                case 4:
                    System.out.println("This is the previous menu !!");
                    break;
                default:
                    System.out.println("Please enter a right option");
            }

        }while (option != 4);
    }
    public static void studentMenu(){
        System.out.println("This is the Student Menu");
    }
    public static void teacherMenu(){
        System.out.println("This is the Teacher Menu");
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

    public static void displayStudentList(University university){
        if (university.getStudentsAmount()==0){
            System.out.println("Student list is empty");
        }else{
            for (int i = 0; i<university.getStudentsAmount(); i++){
                System.out.println(university.getStudentByIndex(i));
            }
        }

    }

    public static void displaySubjectList(University university){
        if (university.getSubjectAmount()==0){
            System.out.println("Subject list is empty");
        }else{
            for (int i = 0; i<university.getSubjectAmount(); i++){
                System.out.println(university.getSubjectByIndex(i));
            }
        }
    }
}

