package Q3;

import java.util.ArrayList;

public class Problem {
    private String problemStatement;
    private String difficultyLevel;
    private ArrayList<Participants> attemptedBy;

    public Problem(String problemStatement, String difficultyLevel) {
        this.problemStatement = problemStatement;
        this.difficultyLevel = difficultyLevel;
        this.attemptedBy = new ArrayList<>();
    }

    public String getProblemStatement() {
        return problemStatement;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void addParticipant(Participants p) {
        if (!attemptedBy.contains(p)) {
            attemptedBy.add(p);
        }
    }
}
