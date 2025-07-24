package Q11;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


    class Enroll {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        void enrollName() {
            System.out.print("Enter Name: ");
            String newName = sc.next();
            names.add(newName);
            System.out.println(newName + " has been successfully added!");
        }

        void update() {
            System.out.print("Enter the name you want to update: ");
            String prevName = sc.next();
            if (names.contains(prevName)) {
                System.out.print("Enter the new name: ");
                String newName = sc.next();
                int index = names.indexOf(prevName);
                names.set(index, newName);
                System.out.println("Name updated successfully!");
            } else {
                System.out.println("Error: Name not found!");
            }
        }

        void removeName() {
            System.out.print("Enter Name to Delete: ");
            String delName = sc.next();
            if (names.remove(delName)) {
                System.out.println("Member '" + delName + "' removed successfully!");
            } else {
                System.out.println("Error: Name not found!");
            }
        }

        void currentList() {
            if (names.isEmpty()) {
                System.out.println("No members enrolled.");
            } else {
                System.out.println("************ Current List of Members ************");
                for (int i = 0; i < names.size(); i++) {
                    System.out.println((i + 1) + ". " + names.get(i));
                }
                System.out.println("*************************************************");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Enroll enrollObj = new Enroll();

            while (true) {
                System.out.println("*************************************************");
                System.out.println("1. Register (Enroll)");
                System.out.println("2. Update Name");
                System.out.println("3. Cancel Membership (Delete)");
                System.out.println("4. Show Current Members");
                System.out.println("5. Exit");
                System.out.println("*************************************************");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        enrollObj.enrollName();
                        break;
                    case 2:
                        enrollObj.update();
                        break;
                    case 3:
                        enrollObj.removeName();
                        break;
                    case 4:
                        enrollObj.currentList();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number from 1-5.");
                }
            }
        }
    }


