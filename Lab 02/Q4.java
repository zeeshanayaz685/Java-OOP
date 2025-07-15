import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int esum=0;
        int osum=0;
        while (true){
            System.out.print("enter a number from 1-100 and type -1 to exit = ");
            int nums=obj.nextInt();
            if (nums==-1){
                break;
            }
            num.add(nums);
            }
        int n = num.size();
        for(int i =0 ;i<n ;i++){
            if ( num.get(i)%2==0){
                esum+=num.get(i);
            }else{
                osum+=num.get(i);
            }
        }
        System.out.println("Results:");
        System.out.printf("Sum of Entered Even Numbers =%d\n",esum);
        System.out.printf("Sum of Entered odd Numbers =%d",osum);
    }
}
