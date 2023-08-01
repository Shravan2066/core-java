package com.xworkz.finalExamples;

public class FinalVariable {
    final int MY_CONSTANT = 10;

    void display() {
        // Error
        MY_CONSTANT = 20;
        System.out.println("Value of MY_CONSTANT: " + MY_CONSTANT);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.display();
    }
}
