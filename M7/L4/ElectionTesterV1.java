package M7.L4;
/**
 * Purpose: Array version of election program
 * @author Aidan Procopio
 * @version 9/30/2024
 */
public class ElectionTesterV1 {

    private static void printData(Candidate[] candidates) {
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }

    private static int totalVotes(Candidate[] candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotes();
        }
        return totalVotes;
    }

    private static void printTable(Candidate[] candidates) {
        System.out.println("Election Results:\n");
        System.out.println("Candidates            Votes Received            % of Total Votes");
        System.out.println("================================================================");
        int totalVotes = totalVotes(candidates);
        for (Candidate candidate : candidates) {
            System.out.printf("%-20s%-24d%-20.2f%n", candidate.getName(), candidate.getVotes(),
                    ((double) candidate.getVotes() / totalVotes) * 100);
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Ella York", 2598);
        candidates[1] = new Candidate("Graydon Gunning", 1957);
        candidates[2] = new Candidate("Nicholas Storm", 1566);
        candidates[3] = new Candidate("Victoria Joseph", 2305);
        candidates[4] = new Candidate("Maia Geronimo", 2189);

        System.out.println("Raw Election Data:\n");
        printData(candidates);
        System.out.println("\n");
        printTable(candidates);    
    }
}
