import java.util.Scanner;
class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("The prime factors of a numbers are: ");
		for (int i = 2; i <= num; i++) 
		 {
            while (num % i == 0) 
				{
                System.out.print(i + " ");
                num /= i;
				}
		 }
	}
}
