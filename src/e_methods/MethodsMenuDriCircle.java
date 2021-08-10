/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 27-03-2021
 *  Time: 12:43
 */


package e_methods;

import java.util.Scanner;

public class MethodsMenuDriCircle {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            double radius;
            char choice;
            System.out.println("Enter radius of the circle");
            radius = sc.nextDouble();
            do
            {
                System.out.println("*** CIRCLE CALCULATIONS ***");
                System.out.println("1. Display the area of the circle");
                System.out.println("2. Display the circumference of the circle");
                System.out.println("3. Quit");
                System.out.println();
                System.out.println("Enter a number from 1 - 3");
                choice = sc.next().charAt(0);
                switch(choice)
                {
                    case '1' : area(radius);
                        break;
                    case '2' : circum(radius);
                        break;
                    case '3' : break;
                    default : System.out.println("Enter only numbers from 1 - 3");
                        System.out.println();
                }
            } while(choice != '3');
        }
        static void area(double radiusIn)
        {
            double arealn; // local variable
            arealn = 3.1416 * radiusIn * radiusIn; // calculate the area
            System.out.println("The area of the circle is: " + arealn);
        }



        static void circum(double radiusIn)
        {
            double circumference; // local variable
            circumference = 2 * 3.1416 * radiusIn; // calculate the circumference
            System.out.println("The circumference of the circle is: " + circumference);
        }
}

