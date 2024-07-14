package M4.L1;

public class test {
    public static void main(String[] args) {
        int x = 0;
        int lower = 10;
        int upper = 20;
        while(x < 20)
        {
          //print a random number with the lower limit being inclusive and the upper limit being exclusive
          System.out.println((int)(Math.random() * (upper - lower) + lower));
          x ++;
        }
        
    }
}
