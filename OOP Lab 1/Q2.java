import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number = ");
        a=obj.nextInt();
        if(a%2==0){
            System.out.printf("%d is an Even Number ",a);
        }else{
            System.out.printf("%d is an odd Number ",a);
        }
    }
}
