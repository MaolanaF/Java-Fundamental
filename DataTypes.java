package datatypes;
import java.util.Scanner;
/**
 *
 * @author Maolana Firmansyah
 * @version 1.0
 * @since 13-2-2022
 */
public class DataTypes {
     
    public static void main(String[] args) {
        
        //kamus data//
        int number;
        long N;
        
        //algoritma//
        Scanner input = new Scanner(System.in);
        number = input.nextInt(); //masukkan untuk berapa banyak test case yang ingin dijalankan
        
        for(int counter = 0; counter < number; counter++){
            try{
                N = input.nextLong();
                System.out.println(N + " can be fitted in:");
                
                if(N>=-127 && N<=127){
                    System.out.println("* byte");
                }
                if(N>=-32768 && N<=32767){
                    System.out.println("* short");
                }
                if(N>=-2147483648 && N<=2147483647){
                    System.out.println("* int");
                }
                if(N>=-9223372036854775808L && N<=9223372036854775807L){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }              
    }    
}