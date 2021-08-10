/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 26-03-2021
 *  Time: 21:35
 */


package e_methods;

import javax.swing.*;
import java.util.Scanner;

public class MethodClass {
    void methodDemo(int factNo){
        int x = 1;
        for (int i = factNo; i > 0; i--) {
            x = x * i;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("Enter no. to find factorial");
        Scanner input = new Scanner(System.in);
        int fact = input.nextInt();
        MethodClass obj = new MethodClass();
        obj.methodDemo(fact);
    }
}
