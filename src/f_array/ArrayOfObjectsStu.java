/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 27-03-2021
 *  Time: 14:53
 */
package f_array;
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
// Elements of the array are objects of a class Student.
public class ArrayOfObjectsStu{
    public static void main (String[] args)
    {
        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(187,"aman");

        // initialize the second elements of the array
        arr[1] = new Student(189,"vaibhav");

        // so on.............
        arr[2] = new Student(192,"shikar");
        arr[3] = new Student(197,"dharmesh");
        arr[4] = new Student(199,"mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no + " " + arr[i].name);
        }
    }
}
