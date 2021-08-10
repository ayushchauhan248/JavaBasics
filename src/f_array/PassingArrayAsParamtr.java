/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 27-03-2021
 *  Time: 16:32
 */


package f_array;

import java.util.Scanner;

public class PassingArrayAsParamtr {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float[] temperature = new float[7];
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("enter max temperature for day " + (i + 1));
            temperature[i] = keyboard.nextFloat();
        }
        System.out.println("***TEMPERATURES ENTERED***");
        disPlay(temperature);
    }
        static void disPlay(float[] temperatureln){
            for (int i = 0; i < temperatureln.length; i++)
            {
                System.out.println("day "+(i+1)+" "+ temperatureln[i]);
            }
        }
}
