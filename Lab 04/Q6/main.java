package Q6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creating manager at System Limited.....");
        System.out.print("Enter the name of the manager: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Team Size: ");
        int teamSize = sc.nextInt();

        Manager manager = new Manager(name, id, department, teamSize);

    }
}