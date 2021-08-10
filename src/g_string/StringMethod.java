/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 28-03-2021
 *  Time: 12:01
 */


package g_string;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String workString = sc.next();
        System.out.println("Length of the string is : " + workString.length());
        System.out.println("Particular character at position 3 : " + workString.charAt(3));
        System.out.println("Substring from 3 to 6 : " + workString.substring(3,6));
        System.out.println("Concat welcome : " + workString.concat(" Welcome "));
        System.out.println("UpperCase : " + workString.toUpperCase());
        System.out.println("LoweCase : " + workString.toLowerCase());
        System.out.println("Equal check : " + workString.equals("Ayush_chauhan"));
        System.out.println("Equal check by ignore case : " + workString.equalsIgnoreCase("ayush chauhan"));
        System.out.println("Check starts with : " + workString.startsWith("A"));
        System.out.println("Check ends with : " + workString.endsWith("n"));
    }
}
