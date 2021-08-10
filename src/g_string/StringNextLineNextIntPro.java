/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 28-03-2021
 *  Time: 15:09
 */


package g_string;

import java.util.Scanner;

public class StringNextLineNextIntPro {
        public static void main(String[] args)
        {
            double d;
            int i;
            String s;
            Scanner keyboardString = new Scanner(System.in);  // Scanner object for string input
            Scanner keyboard = new Scanner(System.in);        // Scanner object for all other types of input
            System.out.print("Enter a double : ");
            d = keyboard.nextDouble();
            System.out.print("Enter an integer : ");
            i = keyboard.nextInt();
            System.out.print("Enter a string : ");
            s = keyboardString.nextLine();                    // use the Scanner object reserved for string input
            System.out.println();
            System.out.println("You entered : ");
            System.out.println("Double : " + d);
            System.out.println("Integer : " + i);
            System.out.println("String : " + s);
        }
}
