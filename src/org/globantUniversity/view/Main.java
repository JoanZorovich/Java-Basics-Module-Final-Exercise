package org.globantUniversity.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    universityMenu();
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
    public static void universityMenu(){
        Scanner sc= new Scanner(System.in);

        int option;

        do{
            System.out.println("*** Please choose an option ***" +
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
                    System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%n", "ID", "FULL NAME", "USER", "ACCOUNT NUMBER", "OPENING DATE", "BALANCE");

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
}

