/**
 * program for  split the string into tokens.
 * @author Maolana Firmansyah
 */
package inputandoutput;
import java.io.*;
import java.util.Scanner;

public class InputAndOutput {
    static int i;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input from user
        String str = input.nextLine();
        
        if (str.length()==0){
            System.out.println(0);
        }
        else {
            String[] strings = str.split("['!?,._@ ]+"); //split string to token
            System.out.println(strings.length); //print total character
            for (int i=0; i<strings.length; i++){ //print splitted string
                System.out.println(strings[i]);
            }
        }
    } 
}
