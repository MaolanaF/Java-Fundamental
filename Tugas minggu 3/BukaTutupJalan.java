/** 
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 19-2-2022
 */
package bukatutupjalan;
import java.util.Scanner;

public class BukaTutupJalan {

    public static void main(String[] args) {
        //declaring variable
        String platM1, platM2, platM3, platM4;
        //input from user
        Scanner input = new Scanner(System.in);
        platM1 = input.next();
        platM2 = input.next();
        platM3 = input.next();
        platM4 = input.next();
        long plat = Long.parseLong(platM1+platM2+platM3+platM4);
        //check condition
        if ((plat - 999999)%5 == 0){
            System.out.println("berhenti");
        }
        else {
            System.out.println("jalan");
        }
    }
    
}
