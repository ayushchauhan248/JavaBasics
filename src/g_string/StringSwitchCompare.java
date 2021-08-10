/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 28-03-2021
 *  Time: 14:13
 */

package g_string;

import java.util.Scanner;

public class StringSwitchCompare {
    public static void main(String[] args)
        {
            Scanner keyboard = new Scanner (System.in);
            String symbol;
            System.out.println("Enter the symbol(square/circle/triangle)");
            symbol = keyboard.next();
            switch (symbol) {
                case "square" -> System.out.println("ATTACK");
                case "circle" -> System.out.println("BLOCK");
                case "triangle" -> System.out.println("JUMP");
                default -> System.out.println("Invalid Choice");
            }
        }
}
