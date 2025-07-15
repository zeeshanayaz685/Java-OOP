import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    while (true){
    int n=5;
    String [] arr = new String[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Book"+(i+1)+": ");
        arr[i] = sc.nextLine();
    }
    System.out.println("*************Library Receipt**************");
    for (int i = 0; i < n; i++) {
        System.out.println((i+1)+". "+arr[i]);
    }
    System.out.println("Fine per day (overdue):$2");
        System.out.println("Continue for another user ? (Y/N) :");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")){
            continue;
        }else if (choice.equalsIgnoreCase("n")){
            break;
                }

            }
        }
    }


