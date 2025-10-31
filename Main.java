public class Main {

   public static void main(String []args) {
      
      // BOOLEAN VARIABLES can only hold true or false
      boolean lightsOn = false;
      boolean dannyPresent = true;
      
      // BOOLEAN EXPRESSIONS are like questions
      // where the only possible answers are true or false
      boolean exp1 = (dannyPresent == true); // is Danny here?
      boolean epx2 = (lightsOn != true); // are the lights NOT on? (off)

      // Comparing numerical values
      int x = 6;
      int y = 7;

      // Check for EQUALITY using the == operator
      System.out.println( x == y); // you can print boolean exp. directly
      // Check for NOT equal using the != operator
      boolean exp3 = (x != y); // store the boolean exp result in a variable
      System.out.println( exp3 );

      // Compare numeric values (int, double) using RELATIONAL OPERATORS
      System.out.println( x < y ); // true (6 IS LESS THAN 7 )
      System.out.println( x > y); // false
      System.out.println( x <= y ); // true
      System.out.println( x >= y ); // false
      System.out.println( y >= x); // true (ORDER MATTERS w/rel. operators)
      System.out.println( y == y ); // true

      // Can you compare ints and doubles?
      double z = 6.0;
      System.out.println( x == z ); // true (6 and 6.0 are the same value!)
      
   }
}
