public class Printer{
	public static void main(String[] args){
	
	//using literals
	String name="Shravan Dhangi"; 
	String palindrome="madam";
	String state="Karnataka";
	String country="India";
	String keyword="float";
	String greeting="Good Morning";
	String carBrand="Mclaren";
	String city="New York";
	String company="Amazon";
	String flower="Red Rose";
	
	//using new keyword
	String car = new String("Tesla Model S");
    String mobilePhone = new String("iPhone 13");
    String laptop = new String("MacBook Pro");
	String movie = new String("Transformers");
	String animal = new String("Elephant");
	String university = new String("Harvard University");
	String painting = new String("Mona Lisa");
	String sport = new String("Football");
    String instrument = new String("Grand Piano");
	String language = new String("Kannada");
	boolean contains = name.contains("Shravan");
    System.out.println("Contains 'Shravan': " + contains);
	String uppercase = animal.toUpperCase();
    System.out.println("Uppercase: " + uppercase);
	String replaced = flower.replace("Red","White");
    System.out.println("Replaced: " + replaced);
	boolean startsWith = city.startsWith("New");
    System.out.println("Starts with 'New': " + startsWith);
	char[] arr=sport.toCharArray();
	for(int i=0;i<arr.length;i++){
		System.out.println("to charater array: " + arr[i]);}
	}

}