import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees to evaluate : ");
        int n = input.nextInt();
        int [] sales = new int[n];
        int [] attendance = new int[n];
        String[] results = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i+1) + ": ");
            System.out.println("Enter monthly sales : ");
            sales[i] = input.nextInt();
            System.out.println("Enter attendance percentage : ");
            attendance[i] = input.nextInt();
            if(sales[i]>10000){
                if (attendance[i] >=90) {
                    results[i] = "Outstanding";
                }else if (attendance[i] >=75&&attendance[i] <90) {
                    results[i] = "Satisfactory";
                } else if (attendance[i]<75) {
                    results[i] = "Need improvement";
                }
            }else if (sales[i]>=5000&&sales[i]<10000){
                if (attendance[i] >=80) {
                    results[i] = "Satisfactory";
                }else if (attendance[i] <80) {
                    results[i] = "Need improvement";
                }
            } else if (sales[i]<5000) {
                results[i] = "Need improvement";
            }
        }
        System.out.println("Final Report:");
        System.out.println("+---------------------+---------------------+---------------------+");
        System.out.println("|Employee Number\t|Monthly sales\t    \t|\tPerformance\t         |");
        for (int i = 0; i < n; i++) {

            System.out.println("+---------------------+---------------------+---------------------+");
            System.out.println("|"+(i+1)+"\t\t\t\t    |\t\t\t"+sales[i]+"\t\t|\t"+results[i]+"     |");
        }

    }
}
