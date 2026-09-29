import java.util.Scanner;
class BankAccount {
    double balance = 1000.0;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount! Please enter an amount greater than 0.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter an amount greater than 0.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: ₹" + balance);
        } else
             {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (choice != 4);

        sc.close();
    }
}