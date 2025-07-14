import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Give temperature in celcius=");
        a = obj.nextInt();
        float f = (a * 9.0f / 5.0f) + 32.0f;
        System.out.printf("temperature in celcius into farenheit =%.2f", f);


    }
}
