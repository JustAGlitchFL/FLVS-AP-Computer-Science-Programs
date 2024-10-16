package M7.L7;
/**
 * Purpose: Array version of election program
 * @author Aidan Procopio
 * @version 10/12/2024
 */
public class ElectionTesterV7 { 

    private static void printData(Candidate[] candidates) {
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                System.out.println(candidate);
            }
        }
    }

    private static int totalVotes(Candidate[] candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                totalVotes += candidate.getVotes();
            }
        }
        return totalVotes;
    }

    private static void printTable(Candidate[] candidates) {
        System.out.println("Election Results:\n");
        System.out.println("Candidates            Votes Received            % of Total Votes");
        System.out.println("================================================================");
        int totalVotes = totalVotes(candidates);
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                System.out.printf("%-22s%-26d%-4.2f%%%n", candidate.getName(), candidate.getVotes(),
                        ((double) candidate.getVotes() / totalVotes) * 100);
            }
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    private static void changeName(Candidate[] candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    private static void changeVotes(Candidate[] candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    private static void replaceCandidate(Candidate[] candidates, String oldName, String newName, int votes) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(votes);
            }
        }
    }

    private static void insertCandidateByIndex(Candidate[] candidates, int index, String name, int votes) {
        for (int i = candidates.length - 1; i > index; i--) { //last is lost as array is fixed size
            candidates[i] = candidates[i - 1];
        }
        candidates[index] = new Candidate(name, votes);
    }

    private static void insertCandidateBeforeTarget(Candidate[] candidates, String target, String name, int votes) {
        int targetIndex = 0;
        for (; targetIndex < candidates.length && (candidates[targetIndex] == null || !candidates[targetIndex].getName().equals(target)); targetIndex++);//I know this is a weird way to write this, but I'm testing to see if I can do this to avoid using a break or while loop
        
        if (targetIndex < candidates.length) {
            insertCandidateByIndex(candidates, targetIndex, name, votes);
        }
    }

    private static void deleteByIndex(Candidate[] candidates, int index) {
        for (int i = index; i < candidates.length - 1; i++) {
            candidates[i] = candidates[i + 1];
        }
        candidates[candidates.length - 1] = null;
    }

    private static void deleteByTarget(Candidate[] candidates, String target) {
        int targetIndex = 0;
        for (; targetIndex < candidates.length && (candidates[targetIndex] == null || !candidates[targetIndex].getName().equals(target)); targetIndex++);//copied from insertCandidateBeforeTarget
        
        if (targetIndex < candidates.length) {
            deleteByIndex(candidates, targetIndex);
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
        printTable(candidates);    

        System.out.println("\nDeleteing the candidate at index 1\n");
        deleteByIndex(candidates, 1);
        printTable(candidates);

        System.out.println("\nDeleting Maia Geronimo\n");
        deleteByTarget(candidates, "Maia Geronimo");

        System.out.println("\nInserting Skylar Liu with 2273 votes before Nicholas Storm\n");
        insertCandidateBeforeTarget(candidates, "Nicholas Storm", "Skylar Liu", 2273);
        printTable(candidates);
    }
}
