/* Created by IntelliJ IDEA.
 *  Author: Mr. Ayush Chauhan
 *  Date: 27-03-2021
 *  Time: 16:07
 */


package f_array;
class Monkey{

    String monName;
    String monType;

    public Monkey(String monName, String monType) {
        this.monName = monName;
        this.monType = monType;
  }

}
public class ArrayObjectMon {
    public static void main(String[] args) {
        Monkey[] monArr = new Monkey[4];
        Monkey m1 = new Monkey("ayu","BoyMonkey");
        Monkey m2 = new Monkey("mit" , "GirlMoonkey");
        monArr[0] = new Monkey("jumbo" , "EleMonkey");
        monArr[1] = new Monkey("jaggu" , "SpiderMoneky");
        monArr[2] = m1;
        monArr[3] = m2;
        for (Monkey mon:monArr) {
            System.out.println("MONKEY NAME : " + mon.monName +" & "+"MONKEY TYPE : " + mon.monType);
        }
    }
}
