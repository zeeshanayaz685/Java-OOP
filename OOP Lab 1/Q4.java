import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        int a ;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any digit=");
        a=obj.nextInt();
        int sum=0,i=a;
        int n=a;
        while (a!=0) {

            n=a%10;
            sum +=n;
            a=a/10;

        }
        System.out.printf("Sum of digit %d = %d",i,sum);

    }
}
