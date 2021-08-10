/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 27-03-2021
 *  Time: 14:37
 */


package f_array;

public class ArrayIniDec {
    public static void main(String[] args) {
        // 1st way to array
        int[] array1;  // declaration
        array1 = new int[5];  // allocating memory to array1
        // 2nd way to array
        int[] array2 = new int[10];  // both declaration and allocation in one line
        array2[0] = 12;
        array2[1] = 15;
        System.out.println(array2[1]);
        //--------NOW-----------
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };    // Declaring array literal

        // accessing the elements of the specified array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + intArray[i]);
        }
        System.out.println("\nvalue at index 4 is :");
        System.out.println(intArray[4]);
    }
}
