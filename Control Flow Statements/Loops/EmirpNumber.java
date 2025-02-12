import java.util.Scanner;
class EmirpNumber 
{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt(), rev = 0, temp = num, i, count = 0;
        for (i = 2; i < num; i++) 
            if (num % i == 0) count++;
        if (count == 0 && num > 1) 
			{
            while (temp > 0) 
				{
                rev = rev * 10 + temp % 10;
                temp /= 10;
                }
            count = 0; 
            for (i = 2; i < rev; i++) 
            if (rev % i == 0) count++;
            System.out.println(num + ((num != rev && count == 0) ? " is an Emirp." : " is Prime but not Emirp."));
            } 
			else 
		{
            System.out.println(num + " is not Prime.");
        }
    }
}
