package M7.L4;
/**
 * Purpose: Array version of election program
 * @author Aidan Procopio
 * @version 9/30/2024
 */
public class ElectionTesterV3 {

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
            System.out.printf("%-22s%-26d%-4.2f%%%n", candidate.getName(), candidate.getVotes(),
                    ((double) candidate.getVotes() / totalVotes) * 100);
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    private static void changeName(Candidate[] candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    private static void changeVotes(Candidate[] candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    private static void replaceCandidate(Candidate[] candidates, String oldName, String newName, int votes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(votes);
            }
        }
    }
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Ella York", 2598);
        candidates[1] = new Candidate("Graydon Gunning", 1957);
        candidates[2] = new Candidate("Nicholas Storm", 1566);
        candidates[3] = new Candidate("Victoria Joseph", 2305);
        candidates[4] = new Candidate("Maia Geronimo", 2189);

        System.out.println("Original Results\n");
        System.out.println("\n");
        printTable(candidates);    

        // name change
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
