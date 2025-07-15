import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = 5;
            int sum = 0;
            int[] marks = new int[n];
            System.out.println("Enter marks of 5 subjects:");
            for (int i = 0; i < n; i++) {
                System.out.print("Subject" + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                sum += marks[i];
            }

            System.out.println("*************Grade Report************");
            System.out.println("Total marks: 500");
            System.out.println("Total obtained marks: " + sum);
            float percentage = ((float) sum / 500) * 100f;
            System.out.println("Percentage: " + percentage);

            String grade = "Unknown";

            if (percentage >= 80 && percentage <= 100) {
                grade = "A";
            } else if (percentage >= 60 && percentage < 80) {
                grade = "B";
            } else if (percentage >= 40 && percentage < 60) {
                grade = "C";
            } else if (percentage >= 0 && percentage < 40) {
                grade = "F";
            } else {
                System.out.println("Invalid percentage!!");
            }

            System.out.println("Grade: " + grade);

            sc.nextLine();

            System.out.println("Do you want to generate another Report? (Y/N): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("N")) {
                break;
            }
        }
        sc.close();
    }
}
