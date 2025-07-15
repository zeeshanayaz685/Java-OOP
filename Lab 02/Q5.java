import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter no of students =");
        n = sc.nextInt();
        int [] a = new int[n];
        float avg=0;
        int sum =0;
        int pass=0,fail=0;
        for (int i =0 ;i<n ;i++){
            System.out.printf("Enter grade for the student %d = ",i+1);
            a[i]=sc.nextInt();
            sum+=a[i];
            if (a[i]>=60){
                pass++;
            }
            else {
                fail++;
            }
        }
        System.out.println("********Results********");
            avg=sum/n;
        System.out.println("Total number of students = "+n);
        System.out.printf("Average Grade = %.2f\n",avg);
        System.out.println("Total number of Pass students = "+pass);
        System.out.println("Total number of Fail students = "+fail);
    }
}
