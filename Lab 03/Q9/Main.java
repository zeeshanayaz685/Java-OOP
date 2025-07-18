package Q9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter prices(enter -1 to exit) = ");
            int temperature = sc.nextInt();
            if (temperature==-1){
                break;
            }
            temp.add(temperature);
        }
        System.out.print("Orignal prices = ");
        for (int i :temp){
            System.out.print(i+" ");
        }
        System.out.println();
        int n = temp.size();
        int []tempArray = new int[n];
        System.out.print("Discounted prices = ");
        for (int i = 0; i < n; i++) {

            tempArray[i] = temp.get(i)/10;
            int tempe = temp.get(i)-tempArray[i];
            System.out.print(tempe+" ");
        }

    }
}
