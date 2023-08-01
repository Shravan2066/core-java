package com.xworkz.constOverloading;

public class StudentRunner {
	public static void main(String[] args) {
        Student student1 = new Student("Shravan", 20, "Computer Science");
        Student student2 = new Student("Ram", 22);
        Student student3 = new Student();

        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
        System.out.println();

        student3.displayDetails();
    }
}
