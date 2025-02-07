import java.util.Scanner;
class Year
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minues: ");
		long min = sc.nextLong();
		final int daymin = 24*60;
		final int day_year= 365;
		float totalDay = min/daymin;
		int totalYear = (int) totalDay/day_year;
		float remainDay = totalDay % day_year;
		 
		System.out.print("The conversion from Minute to Year is: "+totalYear+ "and total Days is: "+remainDay);
		
	}
}

