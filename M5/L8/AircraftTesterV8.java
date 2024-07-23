package M5.L8;

/**
 * @purpose: AircraftTesterV8 client class
 * 
 * @author Aidan Procopio
 * @version 7/22/2024
 */

public class AircraftTesterV8 {
    
    public static void main(String[] args) {
        // first instance
        AircraftV8 GHOST47 = new AircraftV8();
        GHOST47.setname("F-22");
        GHOST47.setcallsign("GHOST47");
        GHOST47.setAIM9X(2);
        GHOST47.setAIM120D(6);
        GHOST47.setfuellbs(18000);
        GHOST47.setrange(GHOST47.calcrange(GHOST47.getfuellbs(), 30000, 1000));

        AircraftV8 STRYK93 = new AircraftV8("F-15E", "STRYK93", 4, 8, 22267, 1000);

        AircraftV8 SPARK85 = new AircraftV8("F-35", "SPARK85", 4, 6, 18250, 1200);
        
        GHOST47.fox3(true, true, 152, true); 

        STRYK93.fox3(true, true, 285, true, 2);

        SPARK85.fox3(false, true, 48, true);

        System.out.println();

        GHOST47.printstores(GHOST47.getname(), GHOST47.getcallsign(), GHOST47.getAIM9X(), GHOST47.getAIM120D(), GHOST47.getfuellbs(), GHOST47.getrange());

        System.out.println();

        STRYK93.setrange(STRYK93.calcrange(STRYK93.getfuellbs(), 30000, 1000));

        STRYK93.printstores(STRYK93.getname(), STRYK93.getcallsign(), STRYK93.getAIM9X(), STRYK93.getAIM120D(), STRYK93.getfuellbs(), STRYK93.getrange());

        System.out.println();

        SPARK85.setrange(SPARK85.calcrange(SPARK85.getfuellbs(), 30000, 1000));

        SPARK85.printstores(SPARK85.getname(), SPARK85.getcallsign(), SPARK85.getAIM9X(), SPARK85.getAIM120D(), SPARK85.getfuellbs(), SPARK85.getrange());
    }
}
