package M5.S1MC;

public class Swapper
{
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    while (a >= 0)
    {
        b = 6;
        while (b <= a)
        {
            b++;
        }
        a -= b;
    }
    System.out.println(b);
  }
}
