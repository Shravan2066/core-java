package com.xworkz.finalExamples;

final class FinalClass {
    void display() {
        System.out.println("FinalClass method");
    }
}

//error
 class SubClass extends FinalClass {
 }

