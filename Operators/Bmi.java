import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter height in inches: ");
		float p = sc.nextFloat();
		float i = sc.nextFloat();
        double kg = p*0.45359237;
	    double h = (double) i*0.0254;
		double bmi = (float) kg/h*h;
		System.out.println("Body Mass Index of a person is: " +bmi);
	}
}
