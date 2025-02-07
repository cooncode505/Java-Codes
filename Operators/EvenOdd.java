import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		//System.out.print(num/2==num/2.0);
		System.out.print((num/2)*2==num);
	}
}
