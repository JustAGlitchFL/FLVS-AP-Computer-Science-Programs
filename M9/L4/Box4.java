package M9.L4;
/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    public String toDimensions(){
        return getLength()+ " X " + getWidth() + " X " + height;
    }

    public boolean equals(Box4 b)
    {
        if(getLength() == b.getLength() && getWidth() == b.getWidth() && getHeight() == b.getHeight())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
