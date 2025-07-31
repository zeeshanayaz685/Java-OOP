package Q5;

public class AutomationSystem {
    private int DeviceID;
    private String type;
    private int PowerConsumption;
    private boolean Status;

    public AutomationSystem(int DeviceID, String type, int PowerConsumption, boolean Status) {
        this.DeviceID = DeviceID;
        this.type = type;
        this.PowerConsumption = PowerConsumption;
        this.Status = Status;
    }

    public AutomationSystem() {
        this.DeviceID = 0;
        this.type = "Unknown";
        this.PowerConsumption = 0;
        this.Status = false;
    }

    public int getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(int DeviceID) {
        this.DeviceID = DeviceID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPowerConsumption() {
        return PowerConsumption;
    }

    public void setPowerConsumption(int PowerConsumption) {
        this.PowerConsumption = PowerConsumption;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public void DisplayAutomationSystem() {
        System.out.print("Device ID: " + getDeviceID() + " | ");
        System.out.print("Type: " + getType() + " | ");
        System.out.print("Power Consumption: " + getPowerConsumption() + "W | ");
        System.out.print("Status: " + (isStatus() ? "ON" : "OFF") + " | ");
        System.out.println();
    }

    public long powerConsumption(boolean status, int powerConsumption) {
        if (status) {
            return powerConsumption;
        }
        return 0;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Device Record deleted: " + getDeviceID());
        } finally {
            super.finalize();
        }
    }
}