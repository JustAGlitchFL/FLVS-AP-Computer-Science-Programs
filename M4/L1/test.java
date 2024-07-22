package M4.L1;

public class test {
    public static void main(String[] args) {
        String head = "construction";
        String tail = "";
        if ( head.length() > 5 && "building".compareTo( head ) < 0 )
        {
          tail = head.substring( 5 );
          head = head.substring( 0, 5 );
           
          if ( tail.length() > 5 && "traction".compareTo( tail ) < 0 )
          {
            head += tail.substring( 0, 5 );
            tail = tail.substring( 5 );
          }
        }
        System.out.println( tail );
}
}
