package M6.L7;

public class q3 {
    public String similarTriangles() {
        int side1;
        int side2; //additional vars as needed
        int side3;
        int side4;
        int side5;
        int side6;

        /*assume there is code here to initialize these values*/

        double ratio1 =  (double) side1 / side4;
        double ratio2 =  (double) side2 / side5;
        double ratio3 =  (double) side3 / side6;

        if (ratio1 == ratio2 && ratio1 == ratio3) {
            return "The triangles are similar.";
        } else {
            return "The triangles are not similar.";
        }
    }
}
