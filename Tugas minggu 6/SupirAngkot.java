package assosiation;

import java.util.*;

/**
 *
 * @author Maolana
 */
public class SupirAngkot {
    // Attributes/states/data fields
    private String namaSupirAngkot;
    private List<Penumpang> alamatTujuan;

    public String getNamaSupirAngkot() {
        return namaSupirAngkot;
    }

    public void setNamaSupirAngkot(String namaSupirAngkot) {
        this.namaSupirAngkot = namaSupirAngkot;
    }

    public List<Penumpang> getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(List<Penumpang> alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }
}
