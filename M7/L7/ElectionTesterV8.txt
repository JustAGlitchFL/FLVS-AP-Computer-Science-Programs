package M7.L7;
/**
 * Purpose: ArrayList version of election program
 * @author Aidan Procopio
 * @version 10/12/2024
 */
import java.util.ArrayList;
public class ElectionTesterV8 {

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

    private static void insertCandidateByIndex(ArrayList<Candidate> candidates, int index, String name, int votes) {
        candidates.add(index, new Candidate(name, votes));
    }

    private static void insertCandidateBeforeTarget(ArrayList<Candidate> candidates, String target, String name, int votes) {
        int index = 0;
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(target)) { 
                break;
            }
            index++;
        }
        candidates.add(index, new Candidate(name, votes));
    }

    private static void deleteByIndex(ArrayList<Candidate> candidates, int index) {
        candidates.remove(index);
    }
    
    private static void deleteByTarget(ArrayList<Candidate> candidates, String target) {
        int index = 0;
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(target)) {
                break;
            }
            index++;
        }
        candidates.remove(index);
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
