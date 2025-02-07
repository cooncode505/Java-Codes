import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter subtotal: ");
		float subtotal = sc.nextFloat();
		System.out.print("Enter Graduity: ");
		float graduity= sc.nextFloat();
		float total= subtotal*graduity/100 + subtotal;
		float tipRate= graduity*subtotal/100;
		System.out.println("Enter total: " +total);
		System.out.println("Enter Tip rate: "+tipRate);
	}
}
