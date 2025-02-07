import java.util.Scanner;
class NameProcessor 
    {
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toUpperCase(); 
        System.out.println("Vowels in your name:");
        for (int i = 0; i < name.length(); i++) 
			{
            char ch = name.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
				{
                System.out.print(ch + " ");
                }
            }
        System.out.println("Consonants in your name:");
        for (int i = 0; i < name.length(); i++)
			{
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z' && !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) 
				{
                System.out.print(+i " " +ch);
                }
            }
	    }
	}
