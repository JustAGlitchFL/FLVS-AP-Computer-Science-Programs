package M5.S1MC;

public class SomeTester
{
   public static void main (String[] args)
   {
      String[] mascots = { "Knights", "Seminoles", "Bulls", "Gators" };
      int n = -1;
      String str = "";
      
      for (String m : mascots)
      {
        n = m.indexOf("o") + 2;
        str += m.substring(n);
      }
      System.out.println(str);
   }
}
