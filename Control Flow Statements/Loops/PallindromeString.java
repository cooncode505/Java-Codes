import java.util.Scanner;
class PallindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int len = str.length();
        boolean isPalindrome = true;
        
        for (int i = 0; i < len / 2; i++) 
		{
            if (str.charAt(i) != str.charAt(len - 1 - i)) 
			{
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) 
		{
            System.out.println("Palindrome");
        } else 
		{
            System.out.println("Not a Palindrome");
        }
		
	}
}
