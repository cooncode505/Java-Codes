import java.util.Scanner;
class FactorialAndPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i =2;i<num ;i++ )
		{
			if (num%1==0)
			{
				cnt++;
			}
		}
		System.out.print(cnt==0? num+ "  Is a Prime number" : num+ "  Is not a Prime number");
	}
}
