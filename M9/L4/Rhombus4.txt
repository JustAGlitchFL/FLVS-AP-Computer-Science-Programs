package M9.L4;

public class Rhombus4 extends Parrallelogram4 
{
	// instance variables
    private int side;
    private int height;

    // Constructor for objects of class Rhombus
    public Rhombus4(int s, int h)
    {
        // call superclass
        super(s, h);

        // initialize instance variables
        side = s;
        height = h;
    }

    // return the side
    public int getSide()
    {
        return side;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The rhombus's dimensions are " + getLength() + " X " + getWidth();
    }
}
