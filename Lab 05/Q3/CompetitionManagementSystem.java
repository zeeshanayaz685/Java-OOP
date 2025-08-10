package Q3;

public class CompetitionManagementSystem {
    public static void main(String[] args) {
        Participants ali = new Participants("Ali", 101);
        Competition cp = new Competition(1, "Competitive Programming");

        System.out.println("Registering Participant...");
        ali.registerForCompetition(cp);

        System.out.println("\nCompetition Details:");
        System.out.println("ID: " + cp.getCompetitionId());
        System.out.println("Name: " + cp.getName());

        Problem p1 = new Problem("Write a code to find the sum of a and b.", "Easy");
        cp.addProblem(p1);

        System.out.println("\nProblem Details:");
        System.out.println("Statement: " + p1.getProblemStatement());
        System.out.println("Difficulty: " + p1.getDifficultyLevel());

        Solution cpSolution = new Solution("int c = a + b;", p1, ali);
        cpSolution.evaluateSolution();
        ali.submitSolution(cpSolution);

        System.out.println("\nSolution Submitted!");


        System.out.println("\nDisplaying Participant Details:");
        ali.displayParticipantDetails();
    }
}
