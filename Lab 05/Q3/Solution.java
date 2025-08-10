package Q3;

public class Solution {
    private String code;
    private Problem problem;
    private Participants participant;
    private boolean isCorrect;

    public Solution(String code, Problem problem, Participants participant) {
        this.code = code;
        this.problem = problem;
        this.participant = participant;
    }

    public void evaluateSolution() {
        isCorrect = code.trim().replace(" ", "").equals("intc=a+b;"); // More flexible check
    }

    public Problem getProblem() {
        return problem;
    }
}
