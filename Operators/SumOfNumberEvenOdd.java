class SumOfNumberEvenOdd 
{
	public static void main(String[] args) 
	{
		int num = 7264;
		int rem = num%10;
		int evensum = 0;
		int oddsum = 0;
		int temp =0;
		temp = (rem%2==0) ? evensum = evensum+ rem : (oddsum =oddsum+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? (evensum = evensum+ rem ): (oddsum =oddsum+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? evensum = evensum+ rem : (oddsum =oddsum+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0) ? evensum = evensum+ rem : (oddsum =oddsum+rem);
		//System.out.print()
		System.out.println("The sum of Even number is: "+evensum);
		System.out.println("The sum of Odd number is: "+oddsum);
	}
}
