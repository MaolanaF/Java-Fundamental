/** 
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 19-2-2022
 */
package berhitung;

import java.util.Scanner;

public class Berhitung {
   
    public static void main(String[] args) {
        // declaring variable
        int numb1;
        int numb2;
        int result=0;
        char operator;
        
        Scanner input = new Scanner(System.in);
        
        // input user
        numb1 = input.nextInt();
        operator = input.next().charAt(0);
        numb2 = input.nextInt();
        
        //check condition 
        if ((numb1>=1&&numb1<=1000)&&(numb2>=1&&numb2<=1000)){
            switch(operator){
                case '+': result = numb1 + numb2; break;
                case '-': result = numb1 - numb2; break;
                case '*': result = numb1 * numb2; break;
                case '/': result = numb1 / numb2; break;
                case '%': result = numb1 % numb2; break;
                default: break;
            }
            System.out.println(result);
        }
    }
    
}
