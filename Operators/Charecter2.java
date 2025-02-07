import java.util.Scanner;
class Charecter2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Charecter: ");
		char ch = sc.next().charAt(0);
	    String op=(ch>=65 && ch<= 90 || ch>= 'a' && ch <= 'z')?((ch>=65 && ch<= 90) ?( "It's Uppercase"): (ch>=90 && ch<= 122)? ("It's Lowercase") :: (ch>=48&&ch<=57)??("It's a digit")::("it's a special charecter");
	    System.out.print(op);
	
		//System.out.println("Hello World!");
	}
}
