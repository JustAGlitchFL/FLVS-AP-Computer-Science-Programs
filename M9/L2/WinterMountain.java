package M9.L2;

public class WinterMountain extends Mountain
{
    private double temp;

    public WinterMountain(int l, int w, int m, double t)
    {
        super(l, w, m);
        temp = t;
    }

    public double getTemp()
    {
        return temp;
    }
    
}
