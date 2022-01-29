package com.javalearning;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static StudentRegister studentRegister = new StudentRegister("Joseph");

    public static void main(String[] args) {

        boolean quit = false;
        startGradeApp();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("\nShutting down...");
                    quit = true;
                }
                case 1 -> studentRegister.printStudentRegister();
                case 2 -> addNewStudent();
                case 3 -> updateStudent();
                case 4 -> removeStudent();
                case 5 -> queryStudent();
                case 6 -> printActions();
            }
        }

    }

    private static void addNewStudent() {
        System.out.println("Enter new Student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.println("Enter Score: ");
        String score = scanner.nextLine();
        Student newStudent = Student.createStudentEntry(name, emailAddress, score);
        if (studentRegister.addNewStudent(newStudent)) {
            System.out.println("New student added: name = " + name + ", Email Address = " + emailAddress +
                                                                                        ", Score = " + score);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateStudent() {
        System.out.println("Enter existing Student name");
        String name = scanner.nextLine();
        Student existingStudentRecord = studentRegister.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
        }
        System.out.println("Enter new student name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new student Email address: ");
        String newEmailAddress = scanner.nextLine();
        System.out.println("Enter new student score: ");
        String newScore = scanner.nextLine();
        Student newStudent = Student.createStudentEntry(newName, newEmailAddress, newScore);
        if (studentRegister.updateStudent(existingStudentRecord, newStudent)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeStudent() {
        System.out.println("Enter existing student name:");
        String name = scanner.nextLine();
        Student existingStudentRecord = studentRegister.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
        }

        if (studentRegister.removeStudent(existingStudentRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting record");
        }

    }

    private static void queryStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();
        Student existingStudentRecord = studentRegister.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Name: " + existingStudentRecord.getName() + "Email Address: " + existingStudentRecord.getEmail()
                                                                                  +  "Score: " + existingStudentRecord.getScore());
        }
    }

    private static void startGradeApp() {
        System.out.println("initializing GradeApp...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("""
                0  - to shutdown.
                1  - to print Student Registry.
                2  - to add new Student.
                3  - to update an existing Student Entry.
                4  - to remove an existing Student Entry.
                5  - to query if an existing student exist.
                6  - to print list of available actions.
                """);
        System.out.println("Choose you action: ");
    }




































}
