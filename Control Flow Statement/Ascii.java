class Ascii
{
	public static void main(String[] args) 
	{
		System.out.println("THIS IS LOWER CASE a to z");
		for (char ch = 'a'; ch<='z' ; ch++)
		{
			System.out.println(ch);
		}
		System.out.println("THIS IS UPPER CASE A TO Z");
		for (char ch = 'A';ch<= 'Z' ;ch++ )
		{
			System.out.println(ch);
		}
		System.out.println("THIS IS DIGITS 0 TO 9 ");
		for (char ch = '0';ch<='9' ;ch++ )
		{
			System.out.println(ch);
		}
		System.out.println("THIS IS ASCII VALUES");
		for (int i = 1; i<=127 ;i++ )
		{
			System.out.println( "ASCII VALUE: " i "Charecter :" + (char)i);
		}
	}
}
