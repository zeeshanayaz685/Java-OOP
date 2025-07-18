package Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter temperature in celcius(enter -1 to exit) = ");
            int temperature = sc.nextInt();
            if (temperature==-1){
                break;
            }
            temp.add(temperature);
        }
        System.out.print("Orignal temperatures in Karachi = ");
        for (int i :temp){
            System.out.print(i+" ");
        }
        System.out.println();
        int n = temp.size();
        int []tempArray = new int[n];
        System.out.print("Apdated temperatures in Karachi = ");
        for (int i = 0; i < n; i++) {
            tempArray[i] = temp.get(i)+2;
            System.out.print(tempArray[i]+" ");
        }

    }
}
