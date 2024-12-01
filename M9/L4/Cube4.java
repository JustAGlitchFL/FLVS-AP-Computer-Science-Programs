package M9.L4;

public class Cube4 extends Box4
{
    // instance variables
    private int side;

    // Constructor for objects of class Cube
    public Cube4(int s)
    {
        // call superclass
        super(s, s, s);

        // initialize instance variables
        side = s;
    }

    // return the side
    public int getSide()
    {
        return side;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}
