import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            ArrayList<String> items = new ArrayList<String>();

            while (true) {
                System.out.println("Enter -1 to Exit adding!!");
                System.out.print("Enter the item that you want to add: ");
                String item = input.nextLine();
                if (item.equals("-1")) {
                    break;
                }
                items.add(item);
            }

            int n = items.size();
            float[] price = new float[n];
            float subtotal = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter " + items.get(i) + " price =");
                price[i] = input.nextFloat();
                subtotal += price[i];
            }
            input.nextLine();

            System.out.println("*************Shopping Receipt**************");
            for (int i = 0; i < n; i++) {
                System.out.printf("%s      %.2f\n", items.get(i), price[i]);
            }

            float discount = subtotal / 10;
            float total = subtotal - discount;

            System.out.println("*******************************************");
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.println("Discount percentage: 10%");
            System.out.printf("Discount amount: $%.2f\n", discount);
            System.out.printf("Total amount after 10%% Discount: $%.2f\n", total);

            System.out.println("Generate another Receipt? (Y/N)");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                continue;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Thank you for Shopping !! Goodbye");
                break;
            } else {
                System.out.println("Invalid choice! Exiting...");
                break;
            }
        }

        input.close();
    }
}
