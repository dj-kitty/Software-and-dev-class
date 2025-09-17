/*This project created by David Johnson 
This projecct counts from zero to 100 using arrays
*/

import java.util.ArrayList;

public class arrayProject {
    public static void main(String[] args) {
        int x = 1;
        int limit = 100;
        int sum = 0;
        ArrayList<Integer> num = new ArrayList<Integer>(); //I chose this type of array because it was easiest to add to.
        for ( x = 0; x<=limit; x++) {
           num.add (x);
        } //This adds every number from 1-100 to the array list
        for (int e : num) {
            System.out.print(e);
            if (e%2 == 1) {
                System.out.println(" is an odd number");
            }
            else {
                System.out.println(" is an even number.");
            }
            sum +=e;
        }
        System.out.println("The sum of all numbers from 0-100 is " + sum);
        }
        
    }
