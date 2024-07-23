package M5.L5;

/**
 * @purpose: AircraftTesterV3 client class
 * 
 * @author Aidan Procopio
 * @version 7/22/2024
 */

public class AircraftTesterV3 {
    
    public static void main(String[] args) {
        String name = "F-22";
        int AIM9X = 2;
        int AIM120D = 6;
        int fuel = 18000;
        int range = 0;
        
        AircraftV3 GHOST47 = new AircraftV3();
        
        GHOST47.fox3(true, true, 152, 1, true);
        range = GHOST47.calcrange(fuel, 30000, 1000);
        System.out.println();
        GHOST47.printstores(name, "GHOST47", AIM9X, AIM120D, fuel, range);
    }
}
