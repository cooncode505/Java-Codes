import java.util.Scanner;
class FactorialAndSumOfOddEvenDigits
	{
        public static void main(String[] args) 
	    {
        int num = 21174;
        int dup = num;  
        int oddsum = 0;
        int evensum = 0;

        while (num > 0) {
            int rem = num % 10; 
            int fact = 1; 
            for (int i = rem; i >= 1; i--) {
                fact *= i;
            }
            if (rem % 2 == 0) {
                evensum += fact;
                System.out.println("Factorial of even digit " + rem + " is: " + fact);
            } else {
                oddsum += fact;
                System.out.println("Factorial of odd digit " + rem + " is: " + fact);
            }
            num = num / 10; 
        }
        System.out.println("Sum of factorials of even digits: " + evensum);
        System.out.println("Sum of factorials of odd digits: " + oddsum);
    }
}
