package M8.L8;
/**
 * purpose: DBA written portion
 * @author Aidan Procopio
 * @version 11/27/2024
 */

import java.util.ArrayList;
public class DBA2 {
    public static int[][] calcmagicmath(int[] rowH, int[] colH) {
        int[][] array = new int[rowH.length][colH.length + 1];
        int lastColHeader = (int)(Math.random() * 28) + 3;
        for (int i = 0; i < rowH.length; i++) {
            for (int j = 0; j < colH.length + 1; j++) {
                if (j == colH.length) {
                    array[i][j] = rowH[i] * lastColHeader;
                } else {
                    array[i][j] = colH[j] * rowH[i];
                }
            }
        }
        return array;
    }
    public static ArrayList<Integer> oddNumbers(int[][] twoD) {
        ArrayList<Integer> oddNums = new ArrayList<Integer>();
        for (int i=twoD.length-1; i>=0; i--) {
            for (int j=0; j<twoD[i].length; j++) {
                if (twoD[i][j] % 2 != 0) {
                    oddNums.add(twoD[i][j]);
                }
            }
        }
        return oddNums;
    }
}    