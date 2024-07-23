package M5.L8;

public class AircraftV8 {
    public AircraftV8() { // default constructor
    }

    // initialize private instance variables
    private String name;
    private String callsign;
    private int AIM9X;
    private int AIM120D;
    private int fuellbs;
    private int range;

    public AircraftV8(String name, String callsign, int AIM9X, int AIM120D, int fuellbs, int range) { // loaded constructor
        this.name = name;
        this.callsign = callsign;
        this.AIM9X = AIM9X;
        this.AIM120D = AIM120D;
        this.fuellbs = fuellbs;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setcallsign(String callsign) {
        this.callsign = callsign;
    }
    public String getcallsign() {
        return callsign;
    }
    public void setAIM9X(int AIM9X) {
        this.AIM9X = AIM9X;
    }
    public int getAIM9X() {
        return AIM9X;
    }
    public void setAIM120D(int AIM120D) {
        this.AIM120D = AIM120D;
    }
    public int getAIM120D() {
        return AIM120D;
    }
    public void setfuellbs(int fuellbs) {
        this.fuellbs = fuellbs;
    }
    public int getfuellbs() {
        return fuellbs;
    }
    public void setrange(int range) {
        this.range = range;
    }
    public int getrange() {
        return range;
    }



    public void fox3(boolean arm , boolean vis , int trackid, boolean release, int ripple) { // with ripple
        if (arm) {
            if (release) {
                if (vis) {
                        System.out.println("GHOST47 FOX 3 TIMES " + ripple + " TRK"+ trackid + " VIS");
                } else {
                        System.out.println("GHOST47 FOX 3 TIMES " + ripple + " TRK"+ trackid + " BVR");
                }
            } else {
                System.out.println("Error: Weapon not released");
            }
        } else {
            System.out.println("Error: Master Arm disabled");
        }
    }

    public void fox3(boolean arm , boolean vis , int trackid, boolean release) { // without ripple
        if (arm) {
            if (release) {
                if (vis) {
                        System.out.println("GHOST47 FOX 3 TRK"+ trackid + " VIS");
                } else {
                        System.out.println("GHOST47 FOX 3 TRK"+ trackid + " BVR");
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

    public void printstores (String name, String callsign, int AIM9X, int AIM120D, int fuellbs, int range){
        System.out.println("\t\t\t\tStores for " + name + " " + callsign);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("AIM9X: " + AIM9X + "\t\tAIM120D: " + AIM120D + "\t\tFuel: " + fuellbs + " lbs" + "\t\tRange: " + range + " miles");
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
