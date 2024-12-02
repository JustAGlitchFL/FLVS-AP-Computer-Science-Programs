package M9.L4;

/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        shapes.add(new Rectangle4(5, 10));
        shapes.add(new Box4(20, 30, 40));
        shapes.add(new Cube4(50));
        shapes.add(new Parrallelogram4(10, 20));
        shapes.add(new Rhombus4(30, 40));

        for(Rectangle4 r: shapes)
        {
            showEffectBoth(r);
            System.out.println();
        }
        System.out.println("Equality:");
        if(shapes.get(1).equals(shapes.get(2))){
            System.out.println("The box with dimensions " + shapes.get(1).toDimensions() + " is equal to the cube with dimensions " + shapes.get(2).toDimensions());
        } else {
            System.out.println("The box with dimensions " + shapes.get(1).toDimensions() + " is not equal to the cube with dimensions " + shapes.get(2).toDimensions());
        }

        if(shapes.get(3).equals(shapes.get(4))){
            System.out.println("The parallelogram with dimensions " + shapes.get(3).toDimensions() + " is equal to the rhombus with dimensions " + shapes.get(4).toDimensions());
        } else {
            System.out.println("The parallelogram with dimensions " + shapes.get(3).toDimensions() + " is not equal to the rhombus with dimensions " + shapes.get(4).toDimensions());
        }
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}
