package Q3;

import java.util.ArrayList;

public class Competition {
    private int competitionId;
    private String name;
    private ArrayList<Problem> problems;
    private ArrayList<Participants> participants;

    public Competition(int competitionId, String name) {
        this.competitionId = competitionId;
        this.name = name;
        this.problems = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public String getName() {
        return name;
    }

    public void registerParticipant(Participants p) {
        if (!participants.contains(p)) {
            participants.add(p);
            System.out.println("Participant: " + p.getName() + " Added Successfully");
        }
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
        System.out.println("Problem Added Successfully");
    }
}
