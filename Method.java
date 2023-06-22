public class Method{
	public static void main(String[] args){
	System.out.println("Examples for datatypes:");
	integerDatatype();
	floatDatatype();
	booleanDatatype();
	characterDatatype();
	stringDatatype();		
	}
public static void integerDatatype(){
	int[] numbers={1,3,5,7,9};
	for (int i=0;i<numbers.length;i++)
	System.out.println("int:"+numbers[i]);
}
public static void floatDatatype(){
	float[] values = {1.5f, 2.7f, 3.9f};
	for (int i=0;i<values.length;i++)
	System.out.println("float:"+values[i]);

} 
public static void booleanDatatype(){
	boolean[] options = {false, true, true, false};
	for (int i=0;i<options.length;i++)
	System.out.println("boolean"+options[i]);
} 
public static void characterDataty+pe(){
	char[] grades = {'A', 'B', 'C'};
	for (int i=0;i<grades.length;i++)
	System.out.println("char:"+grades[i]);
}
public static void stringDatatype(){
	String[] animals = {"dog", "cat", "bird"};
	for (int i=0;i<animals.length;i++)
	System.out.println("string:"+animals[i]);
}  
}