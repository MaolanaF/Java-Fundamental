package agregation;

import java.util.*;
/**
 *
 * @author Maolana
 */
public class AgregationMain {

    public static void main(String[] args) {
        // Instance variables
        Pembalap p1 = new Pembalap("Axel pons", "7");
        Pembalap p2 = new Pembalap("Thomas luthi", "12");
        Pembalap p3 = new Pembalap("Jules Cluzel", "16");
        Pembalap p4 = new Pembalap("Marc Marquez", "93");
        Pembalap p5 = new Pembalap("Pol Espargaro", "44");
        Pembalap p6 = new Pembalap("Fabio Quartararo", "20");
        Pembalap p7 = new Pembalap("Jack Miller", "43");
        Pembalap p8 = new Pembalap("Alex Rins", "42");
        
        // Membuat List Anggota Moto2
        List<Pembalap> Moto2 = new ArrayList<Pembalap>();
        Moto2.add(p1);
        Moto2.add(p2);
        Moto2.add(p3);
        
        // Membuat List Anggota MotoGP
        List<Pembalap> MotoGP = new ArrayList<Pembalap>();
        MotoGP.add(p4);
        MotoGP.add(p5);
        MotoGP.add(p6);
        MotoGP.add(p7);
        MotoGP.add(p8);
        
        kelasPembalap pembalap1 = new kelasPembalap("Moto2", Moto2);
        kelasPembalap pembalap2 = new kelasPembalap("MotoGP", MotoGP);
        
        // Menampilkan Jumlah Pembalap
        System.out.println("========================================");
        System.out.println("Total pembalap yang mengikuti " + 
                pembalap1.getKelasMotoGP() + " = " + pembalap1.getTotalPembalap());
        System.out.println("========================================");
        System.out.println("Total Pembalap yang mengikuti " + 
                pembalap2.getKelasMotoGP() + " = " + pembalap2.getTotalPembalap());
        
    }
    
}
