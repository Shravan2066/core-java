package com.xworkz.inheritance;

//Hierarchical Inheritance
class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}

class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a circle");
 }
}

class Square extends Shape {
 void draw() {
     System.out.println("Drawing a square");
 }
}

public class HeirarchialInheritance {
 public static void main(String[] args) {
     Circle circle = new Circle();
     circle.draw();

     Square square = new Square();
     square.draw(); 
 }
}
