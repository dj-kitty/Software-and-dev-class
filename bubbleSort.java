

public class bubbleSort {
/*David Johnson david.johnson@malad.us
 * Software and Programming Development 1
 * Kim Gross
 */
public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

    int temp;

    temp=arrayToSwap[lowerIndex];

    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

    arrayToSwap[lowerIndex+1]=temp;

    return arrayToSwap;

}
public static void main(String[] args){
    
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
     System.out.println("Unsorted array:");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
        System.out.println(); //This converts the array into integers and prints them out.

    boolean doSwap = true;
    while (doSwap) {
        doSwap = false;//this makes the loop repeat until doSwap is true
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {  //this tells if one number is bigger than the one after it and swaps it. 
                                                        //if we turned the > to a < it would sort the list in descending order
                arrayToSort = swapTwoArrayElements(arrayToSort, i);
                doSwap = true;
            }
        }
    }

    System.out.println("Sorted array:");//This prints the sorted array
    for (int num : arrayToSort) {
        System.out.print(num + " ");
        }
}
}
