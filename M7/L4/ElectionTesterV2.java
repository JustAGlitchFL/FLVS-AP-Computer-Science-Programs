package M7.L4;
/**
 * Purpose: ArrayList version of election program
 * @author Aidan Procopio
 * @version 9/30/2024
 */
import java.util.ArrayList;
public class ElectionTesterV2 {

    private static void printData(ArrayList<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }

    private static int totalVotes(ArrayList<Candidate> candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotes();
        }
        return totalVotes;
    }

    private static void printTable(ArrayList<Candidate> candidates) {
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
        //arraylist version
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        
        candidates.add(new Candidate("Ella York", 2598));
        candidates.add(new Candidate("Graydon Gunning", 1957));
        candidates.add(new Candidate("Nicholas Storm", 1566));
        candidates.add(new Candidate("Victoria Joseph", 2305));
        candidates.add(new Candidate("Maia Geronimo", 2189));

        System.out.println("Raw Election Data:\n");
        printData(candidates);
        System.out.println("\n");
        printTable(candidates);    
    }
}
