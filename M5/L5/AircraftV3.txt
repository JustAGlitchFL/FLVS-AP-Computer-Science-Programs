package M5.L5;

public class AircraftV3 {
    // default constructor
    public AircraftV3() {
    }

    public void fox3(boolean arm , boolean vis , int trackid, int ripple, boolean release) {
        if (arm) {
            if (release) {
                if (vis) {
                    if (ripple > 1) {
                        System.out.println("GHOST47 FOX 3 TIMES " + ripple + " TRK"+ trackid + " VIS");
                    } else {
                        System.out.println("GHOST47 FOX 3 TRK"+ trackid + " VIS");
                    }
                } else {
                    if (ripple > 1) {
                        System.out.println("GHOST47 FOX 3 TIMES " + ripple + " TRK"+ trackid + " BVR");
                    } else {
                        System.out.println("GHOST47 FOX 3 TRK"+ trackid + " BVR");
                    }
                }
            } else {
                System.out.println("Error: Weapon not released");
            }
        } else {
            System.out.println("Error: Master Arm disabled");
        }
    }

    public int calcrange (int fuellbs, int fflowlbph, int speedmph) {
        int range = 0;
        range = (int)(((double) fuellbs / fflowlbph) * speedmph);
        return range;
    }

    public void printstores (String name, String callsign, int AIM9X, int AIM120D, int fuel, int range){
        System.out.println("\t\t\t\tStores for " + name + " " + callsign);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("AIM9X: " + AIM9X + "\t\tAIM120D: " + AIM120D + "\t\tFuel: " + fuel + " lbs" + "\t\tRange: " + range + " miles");
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
