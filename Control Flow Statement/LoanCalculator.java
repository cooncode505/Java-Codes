import java.util.Scanner;

class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("LOAN CALCULATOR");

        System.out.print("Enter the amount: ");
        float amount = sc.nextFloat();

        System.out.print("Enter the ROI: ");
        float roi = sc.nextFloat();

        System.out.print("Enter the tenure (months): ");
        int month = sc.nextInt();

        float con = (float) month / 12;

        System.out.println("LOAN CALCULATION");
        System.out.println("Principal Amount: " + amount);
        System.out.println("ROI: " + roi + "%");
        System.out.println("Tenure: " + month + " months");

        float intYear = amount * roi / 100;
        float totalInter = intYear * con;
        System.out.println("Interest: " + totalInter);

        float outStanding = amount + totalInter;
        System.out.println("Total Outstanding Amount: " + outStanding);

        float emi = outStanding / month;
        System.out.println("EMI: " + emi + " rs");

        sc.close();
    }
}
