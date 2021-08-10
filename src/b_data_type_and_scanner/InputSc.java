/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 26-03-2021
 *  Time: 15:56
 */


package b_data_type_and_scanner;

import java.util.Scanner;

public class InputSc {
    public static void main(String[] args) {
        // make the object of scannner class
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer number");
        int integerInput = input.nextInt();
        System.out.println("enter char or string input");
        String charInput= input.next();
        System.out.println("enter byte input");
        byte byteInput =  input.nextByte();
        System.out.println(integerInput);
        System.out.println(charInput);
        System.out.println(byteInput);


    }
}
