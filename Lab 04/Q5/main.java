package Q5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Default Device Added:");
        AutomationSystem obj = new AutomationSystem();
        obj.DisplayAutomationSystem();
        System.out.println();

        AutomationSystem[] devices = new AutomationSystem[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Device ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Device Type: ");
            String type = sc.next();
            System.out.print("Enter Power Consumption in watts: ");
            int powerConsumption = sc.nextInt();
            System.out.print("Enter Status (1 for ON, 0 for OFF): ");
            int status = sc.nextInt();
            boolean model = (status == 1);
            System.out.println("Status is: " + (model ? "ON" : "OFF"));

            devices[i] = new AutomationSystem(id, type, powerConsumption, model);
            System.out.println();
        }

        long totalPower = 0;
        for (AutomationSystem device : devices) {
            totalPower += device.powerConsumption(device.isStatus(), device.getPowerConsumption());
        }

        for (AutomationSystem device : devices) {
            device.DisplayAutomationSystem();
        }

        System.out.println("Total Active Power Consumption is: " + totalPower + "W");
        System.out.println();
        for (int i = 0; i < devices.length; i++) {
            devices[i] = null;
        }

            System.gc();
    }
    }
