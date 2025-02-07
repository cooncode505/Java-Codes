import java.util.Scanner;
class TemperatureConverter  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Temperature in celsius: ");
		float c = sc.nextFloat();
		double f = 9.0/5 *c+32;
		System.out.print("Conversion from Celsius to Fahrenheit is: " +f);
	}
}
