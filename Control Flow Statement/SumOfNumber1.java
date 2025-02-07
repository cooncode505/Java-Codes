import java.util.Scanner;
class SumOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int dup = num;
	 while (num>0)
	 {
		 int rem = num%10;
		 sum += rem;
		 num/=10;
	 }
	     System.out.println("Number is:" +dup);
		 System.out.println("Sum is: "+sum);
	}
}
