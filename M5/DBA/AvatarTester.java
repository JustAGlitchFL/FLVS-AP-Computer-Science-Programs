package M5.DBA;
/**
 * DBA Assignment   
 *
 * @author (Roshan Patel)
 * @version (11/26/2024)
 */
import java.util.Scanner;
public class AvatarTester {
public static void main (String [] args)
{
//to be implemented in Part B
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Avatar's Name: ");
    String Name = scanner.nextLine();
    
    Avatar player1 = new Avatar(Name, 0);
    
int number_of_games = 0 ;
String Input_level = "";
while (number_of_games < 3){

System.out.println("Enter the level for each of 3 games: ");
Input_level = scanner.nextLine();
    
number_of_games +=1;
player1.updateLevel(Integer.valueOf(Input_level));
}



System.out.println("Name: " + player1.getName());
System.out.println("Level: " + player1.getLevel());

}
}