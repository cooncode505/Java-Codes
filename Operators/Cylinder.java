import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Radius(cm)");
		float radius = sc.nextFloat();
		System.out.print("Enter the height(cm): ");
		float height = sc.nextFloat();
		float pi= 22/7;
		float area =pi*radius*radius;
		System.out.println("Area of Cylinder is: "+area+"cm^2");
		float volume = area*height;
		System.out.println("Volume of Cylinder is: "+volume);
		
	}
}
