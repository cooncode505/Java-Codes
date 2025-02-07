import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("CURRENCY CONVERTER");
		System.out.print("Enter the amount(INR): ");
		float inr = sc.nextFloat();
		System.out.println("***LIST OF CURRENCY***");
		System.out.println("1. USD");
		System.out.println("2. PKR");
		System.out.println("3. EUR");
		System.out.println("4. GBP");
		System.out.println();
		System.out.println("Enter the currency: ");
		String cur= sc.next().toUpperCase();
		float concur= 0;
		if (cur.equals( "USD") )
		{
			concur= inr/86.56f;
			System.out.print(inr+"INR  = " +concur+ "USD" );
		}
		else if (cur.equals("PKR"))
		{
			concur = inr*1.5f;
			System.out.print(inr+"INR  = " +concur+ "PKR");
		}
		else if (cur.equals( "EUR") )
		{
			concur = inr/90.25f;
			System.out.print(inr+"INR   = " +concur+ " EUR");
		}
		else if (cur.equals("GBP"))
		{
			concur = inr*10;
			System.out.print(inr+"INR   = "+concur+ " GBP");
		}
		else { 
			System.out.print("Invalid option");
		}
	}
}