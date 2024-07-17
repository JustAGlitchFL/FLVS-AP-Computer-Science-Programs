package M4.L1;

public class test {
    public static void main(String[] args) {
        for(int outer = 0; outer < 5; outer += 2)
        {
            for(int inner = 0; inner < outer + 1; inner++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
