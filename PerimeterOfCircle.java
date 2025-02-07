import java.util.Scanner;
class PerimeterOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Radius(cm): ");
		float radius = sc.nextFloat();
		final float pi = 22/7;
		float perimeter = 2*pi*(radius);
		System.out.print("Perimeter of circle is : "+perimeter+" cm^2");
	}
}
