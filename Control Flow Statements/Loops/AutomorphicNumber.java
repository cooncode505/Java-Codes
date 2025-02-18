import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
	    int num = sc.nextInt();
		int div = 1;
		int len = 0;
		for (int i =num;i>0 ;i/=10 )
		{
			len++;
		}
		for (int i=1;i<=len ;i++ )
		{
			div*=10;
		}
		System.out.print((num==(num*num)%div)? num+" is a Automorphic Number": num+" is not a Automorphic Number");
		
	}
}
