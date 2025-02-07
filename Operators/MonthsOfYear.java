import java.util.Scanner;
class MonthsOfYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first 3 letters of a Month: ");
		String month = sc.next();
		String op = (month.equals("jan")||month.equals("dec")||month.equals("nov")||month.equals("oct"))?("These are Winter months"):((month.equals("feb")||month.equals("mar")||month.equals("apr")||month.equals("may"))?("These are Summer Months"):((month.equals("jun")||month.equals("jul")||month.equals("aug")||month.equals("sep")?("These are Rainy Months"):("wrong input"))));
		System.out.print(op);
	}
}
