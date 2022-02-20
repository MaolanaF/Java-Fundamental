/** 
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 19-2-2022
 */
package gajiagent;

import java.util.Scanner;

public class GajiAgent {

    public static void main(String[] args) {
        // declaring variable
        int gajiPokok = 500000;
        int hargaItem = 50000;
        int totalItem;
        int bonus = 0;
        int dendaGaji = 0;
        int totalGaji = 0;
        
        //input from user
        Scanner input = new Scanner(System.in);
        totalItem = input.nextInt();
        
        //check condition
        if (totalItem >= 40){
            bonus = ((totalItem * hargaItem)*25/100);
        }
        else if (totalItem >= 80){
            bonus = ((totalItem * hargaItem)*35/100);
        }
        else if (totalItem <= 15){
            dendaGaji = ((15 - totalItem)* hargaItem * 15/100);
            totalGaji = gajiPokok - dendaGaji;
        }
        else{
            bonus = ((totalItem * hargaItem) * 10/100);
            totalGaji = gajiPokok + bonus;
        }
        System.out.println(totalGaji);
        
    }
    
}
