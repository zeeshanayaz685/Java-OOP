package Q6;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int Id, String depart, int teamSize) {
        super(name, Id, depart);
        this.teamSize = teamSize;
        System.out.println("Manager Constructor: " + name + " manages " + teamSize + " team members.");
    }

    public int getTeamSize() {
        return teamSize;
    }
}