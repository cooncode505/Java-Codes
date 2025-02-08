import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        boolean flag = false;
        
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                flag = true;
                System.out.println(i + " is the perfect square root of " + num);
                break; 
            }
        }
        
        if (!flag) {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
