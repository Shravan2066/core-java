package com.xworkz.constOverloading;

public class Student {
    String name;
    int age;
    String department;

    // Constructor with three parameters name, age, and department
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Constructor with two parameters name and age (department is set to "Unknown")
    Student(String name, int age) {
        this.name = name;
        this.age = age;
       
    }

    // Default constructor to create a student with default information
    Student() {
        this.name = " abc";
        this.age = 18;
        this.department = "General";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}
