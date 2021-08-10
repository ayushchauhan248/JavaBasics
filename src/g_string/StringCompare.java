/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 28-03-2021
 *  Time: 14:12
 */

package g_string;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = new String("AYUSH");
        String str2 = new String("AYUSH");
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
