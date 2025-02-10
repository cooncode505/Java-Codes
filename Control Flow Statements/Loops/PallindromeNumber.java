import java.util.Scanner;
class PallindromeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev = 0;
		int dup = num;
		while (num>0)
		{
			rev = 10*rev +num%10;
			num/=10;
		}
		if (dup==rev)
		{
			System.out.print("This is a pallindrome number");
		}
		else 
			System.out.print("This is not a pallindrome number");
	}
}