import java.util.Scanner;


    public class Q1 {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int a,b,c ;
            System.out.print("Enter a = ");
            a=obj.nextInt();
            System.out.print("Enter b = ");
            b=obj.nextInt();
            System.out.print("Enter c = ");
            c=obj.nextInt();
            int options;
            System.out.println("1.Sum\n2.Average\n3.Product\n");

            System.out.println("Enter option from 1-4 = ");
            options=obj.nextInt();

            int j;
            float x;

            switch(options){
                case 1 :
                    j=a+b+c;
                    System.out.println("Sum = "+j);
                    break;
                case 2 :
                    x=(a+b+c)/3;
                    System.out.printf("Average = %.2f\n", x);
                    break;
                case 3 :
                    j=a*b*c;
                    System.out.println("product = "+j);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            obj.close();
        }

    }

