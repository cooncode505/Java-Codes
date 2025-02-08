class PrintAtoZ 
{
	public static void main(String[] args) 
	{
		for (char ch= 'a';ch<='z' ;ch++ )
		{
			System.out.println(ch);
		}
		int a = 1;
		for (char ch= 'A'; ch<='Z' ;ch+=a )
		{
			System.out.println(ch);
			a++;
		}
	}
}
