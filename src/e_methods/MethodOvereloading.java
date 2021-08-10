/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 26-03-2021
 *  Time: 22:32
 */


package e_methods;

public class MethodOvereloading {
    // this version of max accepts two integers and returns the greater of the two
    int max(int firstIn, int secondIn)
    {
        if(firstIn > secondIn)
        {
            return firstIn;
        }
        else
        {
            return secondIn;
        }
    }
    // this version of max accepts three integers and returns the greatest of the three
    int max(int firstIn, int secondIn, int thirdIn)
    {
        int result;
        result = firstIn;
        if(secondIn > result)
        {
            result = secondIn;
        }
        if(thirdIn > result)
        {
            result = thirdIn;
        }
        return result;
    }
    public static void main(String[] args)
        {
            int maxOfTwo, maxOfThree;
            MethodOvereloading obj = new MethodOvereloading();
            maxOfTwo = obj.max(2, 10); // call the first version of max
            maxOfThree = obj.max(19,4,23); // call the second version of max
            System.out.println(maxOfTwo);
            System.out.println(maxOfThree);
        }

}
