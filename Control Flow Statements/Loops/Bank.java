import java.util.Scanner;
class Bank 
	{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = null;
        String password1 = null;
        String address = null;
        long contact = 0;
        double balance = 0.0;
        while (true) 
			{
            System.out.println();
            System.out.println("WELCOME TO LAXMI CHIT FUND");
            System.out.println();
            System.out.println("1. EXISTING USER");
            System.out.println("2. CREATE ACCOUNT");
            System.out.println("3. EXIT");
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (opt == 1) { // LOGIN SECTION
                if (username1 == null) {
                    System.out.println("CREATE YOUR ACCOUNT FIRST");
                    continue;
                }

                System.out.println("\nLOGIN");
                boolean loggedIn = false;
                for (int i = 3; i > 0; i--) {
                    System.out.print("Enter Username: ");
                    String inputUsername = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String inputPassword = sc.nextLine();

                    if (inputUsername.equals(username1) && inputPassword.equals(password1)) {
                        loggedIn = true;
                        break;
                    } else {
                        System.out.println("Invalid credentials. Attempts left: " + (i - 1));
                    }
                }
                if (!loggedIn) {
                    System.out.println("Login failed. Try again later.");
                    continue;
                }
                System.out.println("\nLogin Successful!");
                // HOME PAGE AFTER LOGIN
                while (true) {
                    System.out.println("\n--- HOME PAGE ---");
                    System.out.println("1. CHECK BALANCE");
                    System.out.println("2. DEPOSIT MONEY");
                    System.out.println("3. WITHDRAW MONEY");
                    System.out.println("4. LOGOUT");
                    System.out.print("Choose an option: ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (choice == 1) {
                        System.out.println("Your current balance is: ?" + balance);
                    } else if (choice == 2) {
                        System.out.print("Enter amount to deposit: ?");
                        double deposit = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("?" + deposit + " deposited successfully!");
                        } else {
                            System.out.println("Invalid amount.");
                        }
                    } else if (choice == 3) {
                        System.out.print("Enter amount to withdraw: ?");
                        double withdraw = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("?" + withdraw + " withdrawn successfully!");
                        } else {
                            System.out.println("Insufficient balance or invalid amount.");
                        }
                    } else if (choice == 4) {
                        System.out.println("Logging out...");
                        break; // Exit home page loop
                    } else {
                        System.out.println("Invalid option! Try again.");
                    }
                }
            } else if (opt == 2) { // ACCOUNT CREATION SECTION
                System.out.println("\nCREATE ACCOUNT");
                System.out.print("Enter Username: ");
                username1 = sc.nextLine();
                System.out.print("Enter Password: ");
                password1 = sc.nextLine();
                System.out.print("Enter Address: ");
                address = sc.nextLine();
                System.out.print("Enter Contact Number: ");
                contact = sc.nextLong();
                sc.nextLine(); // Consume newline
                System.out.print("Enter Initial Balance: ?");
                balance = sc.nextDouble();
                sc.nextLine(); // Consume newline
                System.out.println("Account Created Successfully!");
            } else if (opt == 3) { // EXIT
                System.out.println("Thank you for using LAXMI CHIT FUND. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
        sc.close(); // Close scanner
    }
}
