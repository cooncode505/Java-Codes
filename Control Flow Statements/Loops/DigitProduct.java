import java.util.Scanner;
class DigitProduct 
{
    public static void main(String[] args) 
	    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();        
        int product = 1, temp = num;     
        int count = 0, n = num;
        while (n > 0) 
		{
            count++;
            n /= 10;
        }
        System.out.print("The product of the digits entered by the user is: ");    
        while (temp > 0) 
		{
            int digit = temp % 10;
            product *= digit;
            System.out.print(digit);
            temp /= 10;            
            if (--count > 0) 
			{
                System.out.print("x");
            }
        }        
        System.out.println("=" + product);
       
    }
}
