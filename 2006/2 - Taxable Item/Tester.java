
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[]) {
        Vehicle s1 = new Vehicle(.10, 20000, 2500);
        System.out.println(s1.purchasePrice());
        s1.changeMarkup(1000);
        System.out.println(s1.purchasePrice());
        
        Item s2 = new NonTaxableItem(3);
        System.out.println(s2.purchasePrice());
        
    }
}
