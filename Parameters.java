public class Parameters{
    public static void main(String[] args) {
        int largestNo = largestNumber(10, 20);
        System.out.println("Largest number: " + largestNo);
		
		int smallestNo = smallestNumber(5, 16);
        System.out.println("smallest number: " + smallestNo);
		
        String evenOdd = checkEvenOdd(7);
        System.out.println("Number is: " + evenOdd);

        String grade = getGrade(85);
        System.out.println("Grade: " + grade);
		
		int sum = add(5, 7);
		System.out.println("Sum:"+sum);
		
		int dif = sub(10, 8);
		System.out.println("Difference: " + dif);
		
        boolean pos = isPositive(-3);
		System.out.println("is Positive: " + pos);
		
		boolean neg = isNegative(-8);
		System.out.println("is Negative: " + neg);
		
        double avg = average(5, 8, 3);
		System.out.println("Average: " + avg);
		
        int pow = power(2, 4);
		System.out.println("Power: " + pow);
    }

    public static int largestNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
	public static int smallestNumber(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }


    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
	public static int add(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a + b;
        } else {
            return 0;
        }
    }
	public static int sub(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a - b;
        } else {
            return 0;
        }
    }
	public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
	public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
	public static double average(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            return (a + b + c) / 3.0;
        } else {
            return 0.0;
        }
    }
	public static int power(int base, int exponent){
		if(exponent>0){
			int result=1;
			for(int i=0;i<=exponent;i++){
				result*=base;}
				return result;
		}
		else{
			return 1;
		}
	}
}




