import java.util.Scanner;
import static java.lang.System.exit;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("Welcome to the bank of Pakistan");
        System.out.println("**********************************************");
        Scanner input = new Scanner(System.in);
        String name = "nadeem";
        String pass = "xyz123";

        while (true) {
            System.out.println("Enter username = ");
            String username = input.nextLine();
            System.out.println("Enter password = ");
            String password = input.nextLine();

            if (name.equals(username)) {
                if (pass.equals(password)) {
                    System.out.println("Login successful! Welcome " + name + "!");
                    break;
                } else {
                    System.out.println("Incorrect password!!");
                }
            } else {
                System.out.println("Incorrect username!!");
            }
        }

        int totalAmount = (int) (Math.random() * 100000);
        int depositAmount;
        int amount;

        System.out.println("Initial balance: " + totalAmount);

        while (true) {
            System.out.print("1. Deposit Money\n2. Withdraw Money\n3. Account Status\n4. Exit\n");
            System.out.println("Enter your choice");
            int options = input.nextInt();
            input.nextLine();

            switch (options) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    depositAmount = input.nextInt();
                    totalAmount += depositAmount;
                    System.out.println("Amount deposited successfully.\nNew balance: " + totalAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount = ");
                    int withdraw = input.nextInt();
                    if (withdraw <= totalAmount) {
                        totalAmount -= withdraw;
                        System.out.println("Amount withdrawn successfully!!\nNew balance = " + totalAmount);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    System.out.println("Account Status\nUsername: " + name + "\nCurrent balance: " + totalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us! Goodbye.");
                    input.close();
                    exit(0);
                    break;
                default:
                    System.out.println("Error!! Please enter options from 1-4.");
                    break;
            }
        }
    }
}
