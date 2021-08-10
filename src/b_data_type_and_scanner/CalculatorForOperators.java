/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 26-03-2021
 *  Time: 16:09
 */


package b_data_type_and_scanner;

import java.util.Scanner;

public class CalculatorForOperators{
    void add(int x, int y){
        int z;
        z = x + y;
        System.out.println(z);

    }
    int multi(int x, int y){
        int z;
        z = x*y;
        return z;
    }
    void sub(int x , int y ){
        int z;
        z = x - y;
        System.out.println(z);
    }
    int divi(int x , int y){
        int z;
        z = x / y;
        return z;
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            int a = sc.nextInt();
            System.out.println("Enter num2");
            int b = sc.nextInt();
            System.out.println("----MENU----");
            System.out.println("Enter you choice :");
            System.out.println("Press 1 for ADD");
            System.out.println("Press 2 for MULTIPLY");
            System.out.println("Press 3 for SUBTRACT");
            System.out.println("Press 4 for DIVIDE");
            System.out.println("Press 5 for exit");
            int c = sc.nextInt();
            CalculatorForOperators calObj = new CalculatorForOperators();
            switch (c) {
                case 1 -> calObj.add(a, b);
                case 2 -> System.out.println(calObj.multi(a, b));
                case 3 -> calObj.sub(a, b);
                case 4 -> System.out.println(calObj.divi(a, b));
                case 5 -> System.exit(0);
                default -> System.out.println("invalid choice");
            }
        }
    }
}
