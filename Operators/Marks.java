import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sum of marks: ");
		int marks = sc.nextInt();
		float p = (marks*100/600);
		String op = (p>=75)?(p+ "Grade A"):((p>=60)?(p+ "Grade B"):((p>35)?(p+ "Grade C"):(p+ "Fail")));
		System.out.print(op);
		
	}
}
