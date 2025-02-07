import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.print
			((num==2|| num==3 ||num==11||num==5||num==7)?(num + ": It's prime"):((num%2==0 || num%3==0 ||num%5==0||num%7==0||num%11==0)?(num+ ": It's not a prime"):(num+ "It's a prime")));
	}
}
