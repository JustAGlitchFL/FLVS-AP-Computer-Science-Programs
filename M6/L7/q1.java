package M6.L7;

public class q1 {
    public static void main(String[] args) {
        CupOJava c0 = new Espresso( 2 );
        CupOJava c1 = new Doppio( 1 );
        CupOJava c2 = new Mocha( 2 );
        CupOJava c3 = new Latte( 2 );
        CupOJava c4 = new ExtraFrothy( 2 );
        CupOJava[] cups = { c0, c1, c2, c3, c4 };
        int maxIdx = 0;
        for ( int i = 1; i < cups.length ; i++ )
          if ( cups[ i ].getPrice() > cups[ maxIdx ].getPrice() )
            maxIdx = i;
    
        System.out.println( cups[ maxIdx ].getClass().getName() );
    }
}
