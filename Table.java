public class Table{
	static int salary;
	static long phno;
	static float cgpa;
	static double pi;
	static char grade;
	public Table(){
		System.out.println("This is a default contructor");
		System.out.println("salary:"+salary);
		System.out.println("phone no.:"+phno);
		System.out.println("cgpa:"+cgpa);
		System.out.println("pi:"+pi);
		System.out.println("grade:"+grade);
	}
	public Table(int salary1, long phno1, float cgpa1, double pi1, char grade1){
		System.out.println("This is a parameterized contructor");
		salary=salary1;
		phno=phno1;
		cgpa=cgpa1;
		pi=pi1;
		grade=grade1;
	}
	public static void main(String[] args){
		new Table();
		Table Table = new Table(50000,9353617814L,7.4f,3.1416329,'A');
		System.out.println("salary:"+salary);
		System.out.println("phone no.:"+phno);
		System.out.println("cgpa:"+cgpa);
		System.out.println("pi:"+pi);
		System.out.println("grade:"+grade);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
