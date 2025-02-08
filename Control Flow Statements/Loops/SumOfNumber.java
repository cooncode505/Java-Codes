class SumOfNumber 
{
	public static void main(String[] args) 
	{
		int num = 7264;
		int sum = 0;
		int rem = num%10;
		sum = sum+rem;
		num = num/10;
		rem = num % 10;
		sum = sum+rem;
		num = num/10;
		rem = num % 10;
		sum = sum+rem;
		num = num/10;
		rem = num % 10;
		sum = sum+ rem;
		System.out.println("Sum of the Number is:" + sum);
	}
}
