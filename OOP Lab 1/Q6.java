import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a= ");
        a=obj.nextInt();
        System.out.print("Enter b = ");
        b=obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After Swapping\n");
        System.out.printf("a=%d\n",a);
        System.out.printf("b=%d",b);
    }
}
