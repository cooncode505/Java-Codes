import java.util.Scanner;
class NeonNumber 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt(); 
        int sq = n * n; 
        int sum = 0;
        while (sq > 0) 
		{
            sum += sq % 10; 
            sq /= 10; 
        }
        System.out.println((n == sum) ? n + " is a Neon Number" : n + " is not a Neon Number");
    }
}
