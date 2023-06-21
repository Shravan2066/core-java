public class Method{
	public static void main(String[] args){
		int a=2;
		int b=2;
		start();
		System.out.println("a="+a+"b="+b);
		System.out.println("addition:");
		add(a,b);
		System.out.println("subtraction:");
		sub(a,b);
		System.out.println("multiplication:");
		mul(a,b);
		System.out.println("division");
		div(a,b);
		
	}
public static void start(){
	System.out.println("arithmetic operations");
}
public static void add(int a, int b){
	int c=a+b;
	System.out.println("the result is "+c);
} 
public static void sub(int a, int b){
	int c=a-b;
	System.out.println("the result is "+c);
} 
public static void mul(int a, int b){
	int c=a*b;
	System.out.println("the result is "+c);
}
public static void div(int a, int b){
	int c=a/b;
	System.out.println("the result is "+c);
}  
}