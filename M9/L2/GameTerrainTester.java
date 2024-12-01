package M9.L2;
/**
 * This class defines multiple terrain types.
 * 
 * @author Aidan Procopio
 * @version 11/27/24
 */

public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain länd = new Terrain(150, 240); // thelaend.de
        Forest forest = new Forest(400, 400, 180);
        Mountain mountain = new Mountain(600, 200, 12);
        WinterMountain winterMountain = new WinterMountain(500, 500, 30, 12.34);
        System.out.println("Länd has dimensions " + länd.getTerrainSize());
        System.out.println("Forest has dimensions " + forest.getTerrainSize() + " and has " + forest.getTrees() + " trees.");
        System.out.println("Mountain has dimensions " + mountain.getTerrainSize() + " and has " + mountain.getMountains() + " mountains.");
        System.out.println("Winter Mountain has dimensions " + winterMountain.getTerrainSize() + " and has " + winterMountain.getMountains() + " mountains and a temperature of " + winterMountain.getTemp() + " degrees.");
        
        
    }
}
