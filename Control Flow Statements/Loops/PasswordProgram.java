import java.util.Scanner;

class PasswordProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 143; 
        int second = 5000;  
        outerLoop:
        while (true) {
            int attempts = 3;  
            while (attempts > 0) 
			{
                System.out.print("Enter your pin: ");
                int pin = sc.nextInt();
                if (pin == storedPin) 
				{
                    System.out.println("PHONE UNLOCKED");
                    break outerLoop; 
                } else 
				{
                    System.out.println("WRONG PIN");
                    System.out.println("ATTEMPTS LEFT: " + (attempts - 1));
                }
                attempts--;
            }
            System.out.println("PHONE DISABLED for " + (second / 1000) + " seconds");
            
            try 
			{
                Thread.sleep(second);
            } catch (InterruptedException e) 
			{
                System.out.println("An error occurred while pausing execution.");
            }
            
            second *= 2; 
        }
    }
}
