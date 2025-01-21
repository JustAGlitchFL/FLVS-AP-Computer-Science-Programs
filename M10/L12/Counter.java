import java.util.ArrayList;

public class Counter {
    public int countOccurrences (ArrayList <String> arr, String str)
    {
        int count = 0;
        for (String s : arr)
        {
            if (s.equals(str))
            {
                count++;
            }
        }
        if (count == 0)
        {
            return -1;
        }
        return count;
    }
}
