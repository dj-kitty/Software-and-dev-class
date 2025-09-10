
/** 
 * This program created by David Johnson.
 * This program is for Software and Program Development.
 * This program counts from 1 to 100 and tells whether each number is odd or even.
 */

   public class FlowControl {
    
        public static void main(String[] args) {
            int x = 1;
            for ( x = 0; x<=100; x++) {
                System.out.print(x);
                if (x%2 == 1){ //Checks to see whether the number is even or odd.
                    System.out.println(" is an odd number.");
                }
                else {
                    System.out.println(" is an even number.");
                }
            } 
        }
     
    }

