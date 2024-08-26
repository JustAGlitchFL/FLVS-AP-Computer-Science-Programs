package M6.L5;
/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Aidan Procopio
 * @version 8/26/2024

 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  The missile knows where it is at all times. It knows this because it knows where it isn't.  ";

        //  Add examples below for the following methods:
        //    trim()
        String trimmed = sample.trim();
        System.out.println("sample.trim() = " + trimmed);
        //    length()
        int length = sample.length();
        System.out.println("sample.length() = " + length);
        //    indexOf with one and two parameters
        int index = sample.indexOf("knows");
        System.out.println("sample.indexOf(\"knows\") = " + index);
        index = sample.indexOf("knows", index + 1);
        System.out.println("sample.indexOf(\"knows\", index + 1) = " + index);
        //    substring() with one and two parameters
        String sub = sample.substring(4);
        System.out.println("sample.substring(4) = " + sub);
        sub = sample.substring(4, 10);
        System.out.println("sample.substring(4, 10) = " + sub);
        //    compareTo()
        int compare = sample.compareTo("The missile knows where it is at all times. It knows this because it knows where it isn't.");
        System.out.println("sample.compareTo(\"The missile knows where it is at all times. It knows this because it knows where it isn't.\") = " + compare);
        //    any other String methods you'd like to try
        char charAt = sample.charAt(4);
        System.out.println("sample.charAt(4) = " + charAt);
        boolean contains = sample.contains("missile");
        System.out.println("sample.contains(\"missile\") = " + contains);

    }

}
