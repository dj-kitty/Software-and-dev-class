
/** 
 * This program created by David Johnson.
 * This program is for Software and Program Development.
 * This program counts from 1 to 100 and tells whether each number is odd or even.
 */

public class FlowControl {
    
    public static void main(String[] args) {
        int x = 1;
        int sum = 0; //This variable holds the sum outside of the loop so it isn't reset after each loop.
        int limit = 100;
        for ( x = 0; x<=limit; x++) {
            System.out.print(x);
            if (x%2 == 1){ //Checks to see whether the number is even or odd.
                System.out.println(" is an odd number.");
            }
            else {
                System.out.println(" is an even number.");
            }
            sum += x;  //This makes the running total of all numbers. Each time the loop repeats the result is added here.
        }
            System.out.println("The sum of the numbers between 0 and " + limit + " is " + sum + ".");
    }
}


