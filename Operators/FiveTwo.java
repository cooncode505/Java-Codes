import java.util.Scanner;
class FiveTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String op = (num%2==0 && num%5 ==0)?("HI2HI5"):(num%2==0)?("HI2"):(num%5==0)?("HI5"):(" ");
		System.out.print(op);
	}
}
//num%2==0 hi2 num%5==0 hi 5 