import java.util.Scanner;
class KrishnamurtiNumber 
{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        int sum = 0, temp = num;
        
        while (temp > 0) 
		    {
            int digit = temp % 10;
            int fact = 1;
            
            for (int i = 1; i <= digit; i++) 
				{
                fact *= i;
                }
           
            sum += fact;
            temp /= 10;
            }
        
        if (sum == num) 
			{
            System.out.println(num + " is a Krishnamurti number.");
            } 
			else 
				{
            System.out.println(num + " is not a Krishnamurti number.");
                }
    }
}
