import java.util.Scanner;
class ReverseOfANumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev = 0;
		while (num>0)
		{
			int rem = num%10;
			rev = rem + 10*rev;
			num/=10;
		}
		System.out.print("The reverse is : "+rev);
	}
}
