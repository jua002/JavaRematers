package com.javalearning;

import java.util.ArrayList;

public class StudentRegister {
    private String myName;
    private ArrayList<Student> myStudent;

    public StudentRegister(String myName) {
        this.myName = myName;
        this.myStudent = new ArrayList<Student>();
    }

    public boolean addNewStudent(Student student) {
        if (findStudent(student.getName()) >= 0) {
            System.out.println("Student already exist");
            return false;
        }
        myStudent.add(student);
        return true;

    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        int foundPosition = findStudent(oldStudent);
        if (foundPosition < 0) {
            System.out.println(oldStudent.getName()  + ", was not found.");
            return false;
        } else if (findStudent(newStudent.getName()) != -1) {
            System.out.println("Student with name " + newStudent.getName() + " already exist. update not successful");
            return false;
        }

        this.myStudent.set(foundPosition, newStudent);
        System.out.println(oldStudent.getName() + ", was replaced with " + newStudent.getName());
        return true;
    }

    public boolean removeStudent(Student student) {
        int foundPosition = findStudent(student);
        if (foundPosition < 0) {
            System.out.println(student.getName() + ", was not found");
            return false;
        }
        this.myStudent.remove(foundPosition);
        System.out.println(student.getName() + ", was deleted...");
        return true;
    }

    private int findStudent(Student student) {
        return this.myStudent.indexOf(student);
    }

    private int findStudent(String studentName) {
        for (int i = 0; i < this.myStudent.size(); i++) {
            Student student = this.myStudent.get(i);
            if (student.getName().equals(studentName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryStudent(Student student) {
        if (findStudent(student) >= 0) {
            return student.getName();
        }
        return null;
    }

    public Student queryStudent(String name) {
        int position = findStudent(name);
        if (position >= 0) {
            return this.myStudent.get(position);
        }
        return null;
    }

    public void printStudentRegister() {
        System.out.println("Student Register");
        for (int i = 0; i < this.myStudent.size(); i++) {
            System.out.println((i+1) + "." + this.myStudent.get(i).getName() +
                                    "-> "  + this.myStudent.get(i).getEmail() +
                                    "-> "  + this.myStudent.get(i).getScore());
        }
    }












}
