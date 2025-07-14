import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c ;
        System.out.print("Enter a = ");
        a=obj.nextInt();
        System.out.print("Enter b = ");
        b=obj.nextInt();
        System.out.print("Enter c = ");
        c=obj.nextInt();
        if(a>b){
            if(a>c){
                System.out.printf("%d is largest ",a);
            }else{
                System.out.printf("%d is largest ",c);
            }
        }else{
            if(b>c){
                System.out.printf("%d is largest ",b);
            }else{
                System.out.printf("%d is largest ",c);
            }

        }

    }
}
