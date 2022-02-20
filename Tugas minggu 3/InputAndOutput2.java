/** 
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 19-2-2022
 */
package inputandoutput;
import java.util.Scanner;

public class InputAndOutput2 {
    int i;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str[] = new String[3]; //declaring arrays
        int numb[] = new int[3];
        
        for (int i=0; i<3; i++){
            str[i] = input.next(); //input string from user 
            numb[i] = input.nextInt(); //input number from user
        }
        
        System.out.println("================================"); //print output
        for (int i=0; i<3; i++){
            System.out.printf("%-15s%03d\n",str[i],numb[i]);
        }
        System.out.println("================================");
    }
}
