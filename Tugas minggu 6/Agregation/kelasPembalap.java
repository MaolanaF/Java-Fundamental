package agregation;

import java.util.*;
/**
 *
 * @author Maolana
 */
public class kelasPembalap {
    // Attributes
    private String kelasMotoGP;
    private List<Pembalap> daftarPembalap;
    
    // Constructor
    public kelasPembalap(String kelasMotoGP, List<Pembalap> daftarPembalap) {
        this.kelasMotoGP = kelasMotoGP;
        this.daftarPembalap = daftarPembalap;
    }
    
    // Methods
    public String getKelasMotoGP() {
        return this.kelasMotoGP;
    }
    
    public int getTotalPembalap() {
        int jumlahPembalap=0;
        
        for(Pembalap p : daftarPembalap) {
            jumlahPembalap++;
        }
        return jumlahPembalap;
    }
}
