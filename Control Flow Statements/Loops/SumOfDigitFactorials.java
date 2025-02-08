import java.util.Scanner;
class SumOfDigitFactorials 
    {
        public static void main(String[] args) 
	    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;  
        int originalNum = num; 
        while (num > 0) 
			{
            int rem = num % 10;  
            int fact = 1; 
            for (int i = rem; i >= 1; i--) 
			{
                fact *= i;
            }
            sum += fact;
            System.out.println("Factorial of " + rem + " is: " + fact);
            num = num / 10;  
        }
        System.out.println("Sum of all digit factorials in " + originalNum + " is: " + sum);
    }
}
