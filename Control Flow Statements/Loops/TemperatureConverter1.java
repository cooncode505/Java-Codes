import java.util.Scanner;
public class TemperatureConverter1
{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
        System.out.println("Select input temperature scale:");
        System.out.println("1. Celsius     2. Fahrenheit    3. Kelvin");
        int inputChoice = sc.nextInt();    
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();   
        System.out.println("Select output temperature scale:");
        System.out.println("1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int outputChoice = sc.nextInt();    
        double convertedTemp = temp;  
        if (inputChoice == 1) 
		{ 
            if (outputChoice == 2) 
			convertedTemp = (temp * 9 / 5) + 32;
            else if (outputChoice == 3) 
			convertedTemp = temp + 273.15;
        } 
		else if (inputChoice == 2) 
		{ 
            if (outputChoice == 1) 
			convertedTemp = (temp - 32) * 5 / 9;
            else if (outputChoice == 3) 
			convertedTemp = (temp - 32) * 5 / 9 + 273.15;
        } 
		else if (inputChoice == 3) 
		{
        if (outputChoice == 1) 
		convertedTemp = temp - 273.15;
        else if (outputChoice == 2) 
		convertedTemp = (temp - 273.15) * 9 / 5 + 32;
        }
        System.out.println("Converted Temperature: " + convertedTemp);

    }
}
