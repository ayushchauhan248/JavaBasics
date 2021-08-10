/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 26-03-2021
 *  Time: 19:44
 */
package d_loops;
import java.util.Scanner;
public class ForLoop {
    void otherPatter(int size) {
        int sum = 1;
        int c = size;
        for (int i = 0; i < size; i++) {
            System.out.println(sum);
            sum = sum * 11;
        }
    }
       public static void main(String[] args){
        ForLoop flobj = new ForLoop();
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        flobj.otherPatter(l);
      /*  for (int i = 1; i <= 5; i++) // outer loop controlling the number of rows
        {
            for (int j = 1; j <= i; j++) // inner loop controlling the number of stars in one row
            {
                System.out.print("*");
            }
            System.out.println();
        }

       */
    }
}