import java.util.Scanner
class  StonePaperScissor
{
	public static void main(String[] args) 
		{
		 Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i<=1; i++)// for ( ; ;  infinite times run hora)
		{
			int num = (int)(Math.random()*10);
			if (num>=1 && num<=3)
			{
				System.out.print(num+ " ");
				continue; // break hogayooo
			}
		i--;
		}
	}
}
