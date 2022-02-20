/** 
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 19-2-2022
 */
package bignumber;
import java.util.Scanner;
import java.math.*;

public class BigNumber {

    public static void main(String[] args) {
        //declaring 
        BigInteger big1,big2;
        //input from user
        Scanner input = new Scanner(System.in);
        big1 = input.nextBigInteger();
        big2 = input.nextBigInteger();
        //print result
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}
