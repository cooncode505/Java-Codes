import java.util.Scanner;
class UpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Charecter: ");
		char ch = sc.next().charAt(0);
	  //(char>=65 && char<= 90)?(" It's an Uppercase Charecter"):("It's not an Uppercase Charecter");
	  String op=(ch>=65 && ch<= 90)?(" It's an Uppercase Charecter"):("It's not an Uppercase Charecter");
	   System.out.print(op);
	
	}
}
