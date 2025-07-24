package Q2;

import java.util.Scanner;

public class Q2 {
    String title ;
    String name;
    float duration;
    int RoomNumber;
    void scheduleSession(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Session Title = ");
        this.title= obj.next();
        System.out.print("Enter Speaker Name = ");
        this.name= obj.next();
        System.out.print("Enter Duration in (min.sec) = ");
        this.duration= obj.nextFloat();
        System.out.print("Enter Room Number = ");
        this.RoomNumber= obj.nextInt();
    }
    void displaySessionDetails(){
        System.out.println("Session Tittle : "+title);
        System.out.println("Speaker Name : "+name);
        System.out.println("Duration : "+duration);
        System.out.println("Room Number : "+RoomNumber);
        System.out.println();

    }

//    Design a Session class with attributes sessionTitle, speakerName, duration, and roomNumber.
//    Implement methods scheduleSession() to assign a speaker and room and displaySessionDetails() to show session
//    information. Create objects for different sessions (e.g., "AI in Modern Applications", "Cybersecurity Trends")
//    and schedule them with speakers.
}
