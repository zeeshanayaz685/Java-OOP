import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int a ;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any digit=");
        a=obj.nextInt();
        int n =1;
        for (int i =5 ;i>=1;i--) {
            n=n*i;
        }
        System.out.printf("%d",n);

    }
}
