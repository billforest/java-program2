// ModifiedHelloWorld.java

public class ModifiedHelloWorld {

  // main method
  public static void main( String[] args) {
//   System.out.print("Hello\n\"I'm Jaehyung.");
//   System.out.print( " This is my story...\"\n");
//   System.out.print( "\tOnce upon a time, a long time ago...\\\n" ) ;
   
   // Concatenation (take one String and add it to another String)
   String text;                      // Declare a String
   text =  "APCS is fun!";           // Assign the String a value
   String text2 = "Don't you agree?"; // Declare + Assign a String
   String text3 = new String ( "We can do it!~" ); // String constructor
   
   String result = text + "\n" + text2 + "\n" + text3;
   System.out.println( result);
   
   int grade = 100;
   System.out.println( "I want a grade of " + grade + ".");
   
   System.out.println( grade * 2.125);
   double grade2 = grade * 2.125;
   System.out.println( grade2 ) ;
   
   /*
    * Challenge (Assignment)
    * Modif this program.
    * Create: 1 boolean, 1 int, 1 double, 1 String with any values 
    * Do some kind of math with int and double and reset values
    * Print the values before and after modification
    * Print the values again but modify them in the print statement
    * Print the String with some escape characters (/n)
    * Print the boolean
    */
   
   
   
   boolean isLate = true;
   int time = 20;
   double minusPoints = 0.5;
   String warning = "You're late!";
   
   System.out.println( "Original time: " + time) ;
   time = time / 2;
   System.out.println( "Modified time: " + time) ;
   System.out.println( "New Modified time: " + ( time + 2 ) ) ;
   
   System.out.println( "Original points: " + minusPoints) ;
   minusPoints = minusPoints * 100;
   System.out.println( "Modified points: " + minusPoints) ;
   System.out.println( "New Modified points: " + ( minusPoints - 50)) ;
   
   System.out.println( "\t\"" + warning + "\", said the Teacher." );
   System.out.println( "Jaehyung is late: " + isLate);
   
                      
   
   
   
   
   
   
  }// end main method
}// end class