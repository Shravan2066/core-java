APTITUDE TEST 2

1.B
2.B
3.A
4.C
5.A
6.A
7.D
8.B
9.A
10.R
11.A
12.B
13.B
14.C

THEORY QUESTIONS

1.A constructor is a method that is executed when an object is created. It has the same name as that of the class. Constructor does not have a return type and modifiers like static and final.
Eg.:
public class Example{
public Example{

}
public static void main(String[] args){
	new Example;
}
}

2. Types of constructors: There are 2 types of constructors.
	i. default constructor: It is the constructor that is created by default when an object is created.It does not have any parameters.
	ii. Parameterized constructor: It is a constructor that has parameters and values can be passed to it as arguements.
	
3. An object is an instance of a class. It can be created using new Keyword. It has states and behaviours. 
   Eg.: String str = new String("hi");

4. A class is a blueprint of an object. It contains all the objects, variables and methods.
   Eg.:public class Car{
	   String name;
	   public static start(){};
   }

5. Method overloading refers to use of methods with same method name and different parameters. There are 3 ways to achieve method overloading. They are:
	i. changing the no. of parameters
	ii. changing the datatypes of the parameters
	iii. changing the order of parameters

6. A variable is a container that is used to store values during the execution of a program. There are 2 types of variables, they are:
		i. Instance variables: These are declared inside a block or methods.
		ii. Local variables : These are declared outside the methods in the class.

7. this keyword is used to assign the parameters in a constructor to the local variables in a class. It is used when the variables passed as arguments and local variables have same names.
	Eg: public class Bike{
		String name;
		int noOfWheels;
		int speed;
		
		public Bike(String name, int noOfWheels, int speed){
			this.name=name;
			this.noOfWheels=noOfWheels;
			this.speed=speed;
		}
		public static void main(String[] args){
			Bike pulsar=new Bike("r200",2,300);
		}
		}
	}

8. 	String is a non-primitive datatype for a variable. It is a sequence of characters and also a class in Java with its own methods. It is used to store words in the form of objects.
	Eg: String name="shravan";

9.  i.charAt():This method returns the character at the index value given as the argument.
	Eg: String name= "shravan";
		name.charAt(1);
	>> h
	ii.replace():This method replace a string with the given string. Two strings are given as arguments.
	Eg: String vehicle= "car";
		vehicle.replace("car", "bike");
	>> "bike"	
	iii.length():this method returns the no. of charactes in a string;
	Eg: String city="bengaluru";
		city.lengh();
	>> 	9
	iv. indexOf() : This method gives the index of the character given as argument.
	Eg: String fruit= "apple";
		fruit.indexOf('l');
	>>  3
	v. split() : This method splits the string based on the character given as argument.
	Eg: String greeting="Hello, good morning";
		greeting.split(" ");

10. 


	PROGRAMMING QUESTIONS
	
1.	
class Television
{
	// default constructor 1
	Television()
		Television(5);
		System.out.println("The Default constructor");
	}
	// parameterized constructor 2
	Television(int x)
	{
		Television(5, 15);
		System.out.println(x);
	}
	// parameterized constructor 3
	Television(int x, int y)
	{
		System.out.println(x * y);
	}
	public static void main(String args[])
	{
		new Television();
	}
}

2. 
public class BankAccount {
    public String accountNumber;
    public String accountHolderName;
    public double balance;
    public boolean isAccountActive;
    public String accountType;
    public String branchName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance,boolean isAccountActive, String accountType, String branchName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.isAccountActive = isAccountActive;
        this.accountType = accountType;
        this.branchName = branchName;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Shravan D", 1000.0, true, "Savings", "Main Branch");

    }
}

3.
i)FISH
public class Fish {
    private String name;
    private String color;
    private boolean isAlive;

    public Fish(String name, String color, boolean isAlive) {
        this.name = name;
        this.color = color;
        this.isAlive=isAlive;
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int status() {
        return isAlive;
    }
}

ii)CAMERA
public class Camera {
    private String brand;
    private String model;
    private double price;

    public Camera(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void takePhoto() {
        System.out.println("Taking a photo with " + brand + " " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

iii)HEADPHONES
public class Headphones {
    private String brand;
    private String model;
    private String color;

    public Headphones(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void playMusic() {
        System.out.println("Playing music with " + brand + " " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

4. public class Reverse{
	public static void main(String[] args){
		int[] primeNumbers={2,3,5,7};
		for (int i=primeNumbers.length-1;i>=0;i--){
			System.out.println(primeNumbers[i]);
		}
			
		}
	}





