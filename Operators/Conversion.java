import java.util.Scanner;
class Conversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pounds: ");
		Float pound = sc.nextFloat();
		Float kg = pound*0.454f;
		System.out.print("Conversion from Pound to Kg is: "+kg);
	}
}
