package com.javalearning;

public class Student {
    private String Name;
    private String email;
    private String score;

    public Student(String name, String score, String email) {
        this.Name = name;
        this.score = score;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public String getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public static Student createStudentEntry(String name, String email, String score) {
        return new Student(name, email, score);
    }
}
