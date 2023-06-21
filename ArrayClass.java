public class ArrayClass{
public static void main(String[] args)
{
	//Literals
int[] studentMarks = {35 , 45 , 25 , 15, 55};
System.out.println("studentMarks");
for(int i=0;i<studentMarks.length;i++)
{
	System.out.println(studentMarks[i]);
}
studentMarks[2] = 10;
System.out.println(studentMarks[2]);
int[] weightOfPatients = {50 , 45 , 35 , 70 , 25 , 60 , 28 , 30};
System.out.println("weightOfPatients");
for(int i=0;i<weightOfPatients.length;i++)
{
	System.out.println(weightOfPatients[i]);
}
int[] numberOfWins = {2 , 3 , 5, 6 , 1 , 8 , 3 , 7};
System.out.println("numberOfWins");
for(int i=0;i<numberOfWins.length;i++)
{
	System.out.println(numberOfWins[i]);
}
float[] Heights = {5.2f , 3.7f , 4.2f , 4.8f , 5.3f};
System.out.println("Heights");
for(int i=0;i<Heights.length;i++)
{
	System.out.println(Heights[i]);
}
float[] weightInKilograms = {1.5f , 2.5f , 3.0f , 4.57f, 7.0f , 2.5f};
System.out.println("weightInKilograms");
for(int i=0;i<weightInKilograms.length;i++)
{
	System.out.println(weightInKilograms[i]);
}
float[] balance = {1000.56f , 205.5f ,3000.678f , 3.63f , 45678.787f , 2347.567f };
System.out.println("balance");
for(int i=0;i<balance.length;i++)
{
	System.out.println(balance[i]);
}
char[] conconents = {'B' , 'C' , 'D' , 'F' , 'G' , 'H' , 'J' ,'K' , 'L' , 'M' , 'N' , 'P' , 'Q' , 'R' , 'T' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
System.out.println("conconents");
for(int i=0;i<conconents.length;i++)
{
	System.out.println(conconents[i]);
}
char[] attendenceOfStudents = {'P' , 'P' , 'P' , 'A' , 'A' , 'P' };
System.out.println("attendenceOfStudents");
for(int i=0;i<attendenceOfStudents.length;i++)
{
	System.out.println(attendenceOfStudents[i]);
}
char[] Initials = {'M' , 'T' , 'P' , 'H' , 'P' , 'A' };
System.out.println("Initials");
for(int i=0;i<Initials.length;i++)
{
	System.out.println(Initials[i]);
}
byte[] numberOfStudentsPresent = {45 , 35, 0 , 10 , 45};
System.out.println("numberOfStudentsPresent");
for(int i=0;i<numberOfStudentsPresent.length;i++)
{
	System.out.println(numberOfStudentsPresent[i]);
}
//Using New KeyWord
char[] vowels = new char[5];
vowels[3] = 'O';
System.out.println("vowels");
for(int i=0;i<vowels.length;i++)
{
	System.out.println(vowels[i]);
}
int[] numbers = new int[10];
numbers[0] = 0;
numbers[1] = 1;
numbers[2] = 2;
numbers[3] = 3;
numbers[4] = 4;
numbers[5] = 5;
numbers[6] = 6;
numbers[7] = 7;
numbers[8] = 8;
numbers[9] = 9;
System.out.println("numbers");
for(int i=0;i<numbers.length;i++)
{
	System.out.println(numbers[i]);
}

}
}