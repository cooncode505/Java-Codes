import java.util.Scanner;
class OddEvenDigitSum 
{
    public static void main(String[] args) 
		{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int oddSum = 0, evenSum = 0;
        while (num > 0) 
			{
            int digit = num % 10; 
            if (digit % 2 == 0) 
			{
                evenSum += digit; 
            } else {
                oddSum += digit; 
            }
            num /= 10; 
        }
        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Sum of even digits: " + evenSum);
    }
}
