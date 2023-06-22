public class ReturnType{
	public static void main(String[] args){
		byte daysInAWeek=byteDatatype();
		short year=shortDatatype();
		int pages=intDatatype();
		long worldPopulation=longDatatype();
		float cgpa=floatDatatype();
		double pi=doubleDatatype();
		boolean amIAlive=booleanDatatype();
		char gender=charDatatype();
		String fruit=stringDatatype();
		String[] animals=arrayDatatype();
		System.out.println("daysInAWeek="+daysInAWeek);
		System.out.println("year="+year);
		System.out.println("pages="+pages);
		System.out.println("worldPopulation="+worldPopulation);
		System.out.println("cgpa="+cgpa);
		System.out.println("pi="+pi);
		System.out.println("amIAlive="+amIAlive);
		System.out.println("gender="+gender);
		System.out.println("fruit="+fruit);
		for(int i=0;i<animals.length;i++)
		System.out.println("animals="+animals[i]);
	}
	public static byte byteDatatype(){
		byte a=7;
		return a;
	}
	public static short shortDatatype(){
		short b=2023;
		return b;
	}
	public static int intDatatype(){
		int c=200;
		return c;
	}
	public static long longDatatype(){
		long d=7800000000L;
		return d;
	}
	public static float floatDatatype(){
		float e=7.1f;
		return e;
	}
	public static double doubleDatatype(){
		double f=3.14159;
		return f;
	}
	public static boolean booleanDatatype(){
		boolean g=true;
		return g;
	}
	public static char charDatatype(){
		char h='M';
		return h;
	}
	public static String stringDatatype(){
		String i="apple";
		return i;
	}
	public static String[] arrayDatatype(){
		String[] j={"dog","snake","shark"};
		return j;
	}
	
	
	
}