package M9.L2;

public class Forest extends Terrain
{
    private int trees;

    public Forest(int l, int w, int t)
    {
        super(l, w);
        trees = t;
    }

    public int getTrees()
    {
        return trees;
    }
    
}
