package Q3;

import java.util.ArrayList;

public class Participants {
    private String name;
    private int id;
    private ArrayList<Competition> competitions;
    private ArrayList<Solution> solutions;

    public Participants(String name, int id) {
        this.name = name;
        this.id = id;
        this.competitions = new ArrayList<>();
        this.solutions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void registerForCompetition(Competition comp) {
        if (!competitions.contains(comp)) {
            competitions.add(comp);
            comp.registerParticipant(this);
        }
    }

    public void displayParticipantDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public void submitSolution(Solution sol) {
        solutions.add(sol);
        sol.getProblem().addParticipant(this); // Track problem attempts
    }
}
