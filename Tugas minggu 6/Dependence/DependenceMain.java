package dependence1;

/**
 *
 * @author Maolana
 */
public class Main {

    public static void main(String[] args) {
       // states //
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        Bensin bensin = new Bensin();
        
        bensin.setBensin(mobil);
        bensin.pakaiBensin();
        
        bensin.setBensin(motor);
        bensin.pakaiBensin();
    }
    
}
