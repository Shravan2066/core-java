public class Institute{
	public static void main(String[] args){
	 // Calling the largestNumber method with different parameter types
        int largest1 = largestNumber(10, 20);
        System.out.println("Largest number: " + largest1);
		
        int largest2 = largestNumber(10, 20,30,40);
        System.out.println("Largest number: " + largest2);
		
        float largest3 = largestNumber(15.7f, 12.5f);
        System.out.println("Largest number: " + largest3);
		
        int largest4 = largestNumber(5, 10, 8);
        System.out.println("Largest number: " + largest4);
		
        int largest5 = largestNumber(2,4);
        System.out.println("Largest number: " + largest5);
		
        double largest6 = largestNumber(12.5, 8.7);
        System.out.println("Largest number: " + largest6);

        // Calling the average method with different parameter types
        double avg1 = average(5, 8, 3);
        System.out.println("Average: " + avg1);
		
        double avg2 = average(2.5, 3.5, 4.5);
        System.out.println("Average: " + avg2);
		
        double avg3 = average(10, 20);
        System.out.println("Average: " + avg3);
		
        double avg4 = average(5, 10, 4.5);
        System.out.println("Average: " + avg4);
		
        double avg5 = average(2, 4, 6.5);
        System.out.println("Average: " + avg5);
		
        short shortNum = 5;
        double avg6 = average(shortNum, 10);
        System.out.println("Average: " + avg6);
		
        // Calling the add method with different parameter types
        double sum1 = add(5, 7);
        System.out.println("Sum: " + sum1);
		
        double sum2 = add(2.5, 3.8);
        System.out.println("Sum: " + sum2);
		
        double sum3 = add(5, 7, 9);
        System.out.println("Sum: " + sum3);
		
        double sum4 = add(2.5f, 3.8f, 4.2f);
        System.out.println("Sum: " + sum4);
		
        double sum5 = add(5, 7, 4.5);
        System.out.println("Sum: " + sum5);
		
        double sum6 = add(2.5f, 3.8f);
        System.out.println("Sum: " + sum6);
	}
	//largestNumber method
	public static int largestNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	
	public static int largestNumber(int num1, int num2, int num3, int num4) {
    int largest = num1;
    if (num2 > largest) {
        largest = num2;
    }
    if (num3 > largest) {
        largest = num3;
    }
    if (num4 > largest) {
        largest = num4;
    }
    return largest;
}

	public static float largestNumber(float num1, float num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	public static int largestNumber(int num1, int num2, int num3) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	public static byte largestNumber(byte num1,byte num2) {
    if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	public static double largestNumber(double num1, double num2){
	if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	//average method
	
	public static double average(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            return (a + b + c) / 3.0;
        } else {
            return 0.0;
        }
    }
	public static double average(double a, double b, double c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return (a + b + c) / 3.0;
    } else {
        return 0.0;
    }
	}
	
public static double average(int a, int b) {
    if (a >= 0 && b >= 0) {
        return (a + b) / 2.0;
    } else {
        return 0.0;
    }
}
public static double average(int a, double b, double c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return (a + b + c) / 3.0;
    } else {
        return 0.0;
    }
}
	public static double average(int a, int b, double c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return (a + b + c) / 3.0;
    } else {
        return 0.0;
    }
}


    public static double average(byte a, int b) {
        if (a >= 0 && b >= 0) {
            return (a + b) / 2.0;
        } else {
            return 0.0;
        }
    }

//add method


public static int add(int a, int b) {
    if (a >= 0 && b >= 0) {
        return a + b;
    } else {
        return 0;
    }
}

public static double add(double a, double b) {
    if (a >= 0 && b >= 0) {
        return a + b;
    } else {
        return 0.0;
    }
}
public static double add(int a, int b,int c) {
    if (a >= 0 && b >= 0 && c>=0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(float a, float b, float c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(int a, int b, double c) {
    if (a >= 0 && b >= 0 && c >= 0) {
        return a + b + c;
    } else {
        return 0.0;
    }
}
public static double add(float a, float b) {
    if (a >= 0 && b >= 0 ) {
        return a + b;
    } else {
        return 0.0;
    }
}

}