import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius(cm): ");
		float radius = sc.nextFloat();
		final float pi = 22/7;
		float area = pi *(radius*radius);
		System.out.println("Area of circle is :  "+area+" cm^2" );
		
	}
}
