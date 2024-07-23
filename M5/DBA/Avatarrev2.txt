package M5.DBA;

public class Avatarrev2 {
    public Avatarrev2() { // default constructor
    }   

    // initialize private instance variables
    private String name;
    private int level;

    public Avatarrev2(String name, int level) { // loaded constructor
        this.name = name;
        this.level = level;
        if (level < 0) {
            this.level = 0;
        }
    }  
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void updatelevel(int change) {
        level += change;
        if (level < 0) {
            level = 0;
        }
    }
    public int getlevel() {
        return level;
    }
}
