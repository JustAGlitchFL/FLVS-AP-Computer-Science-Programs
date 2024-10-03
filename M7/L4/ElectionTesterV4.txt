package M7.L4;
/**
 * Purpose: ArrayList version of election program
 * @author Aidan Procopio
 * @version 9/30/2024
 */
import java.util.ArrayList;
public class ElectionTesterV4 {

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
            System.out.printf("%-22s%-26d%-4.2f%%%n", candidate.getName(), candidate.getVotes(),
                    ((double) candidate.getVotes() / totalVotes) * 100);
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    private static void changeName(ArrayList<Candidate> candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    private static void changeVotes(ArrayList<Candidate> candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    private static void replaceCandidate(ArrayList<Candidate> candidates, String oldName, String newName, int votes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(votes);
            }
        }
    }

    public static void main(String[] args) {
        //arraylist version
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        
        candidates.add(new Candidate("Ella York", 2598));
        candidates.add(new Candidate("Graydon Gunning", 1957));
        candidates.add(new Candidate("Nicholas Storm", 1566));
        candidates.add(new Candidate("Victoria Joseph", 2305));
        candidates.add(new Candidate("Maia Geronimo", 2189));

        System.out.println("Original Results:\n");
        printTable(candidates);

        //name change
        System.out.println("\nChanging Maia Geronimo to Garrett Smith\n");
        changeName(candidates, "Maia Geronimo", "Garrett Smith");
        printTable(candidates);

        // vote change
        System.out.println("\nChanging Ella York's votes to 3164\n");
        changeVotes(candidates, "Ella York", 3164);
        printTable(candidates);

        //full replacement
        System.out.println("\nReplacing Nicholas Storm with Chase Kennedy who has 1742 votes\n");
        replaceCandidate(candidates, "Nicholas Storm", "Chase Kennedy", 1742);
        printTable(candidates);
    }
}
