package assosiation;

/**
 *
 * @author Maolana
 */
public class Penumpang {
    // Attributes/states/data fields
    private String AlamatPenumpang;

    public String getAlamatPenumpang() {
        return AlamatPenumpang;
    }

    public void setAlamatPenumpang(String AlamatPenumpang) {
        this.AlamatPenumpang = AlamatPenumpang;
    }
    
    @Override
    public String toString() {
        return AlamatPenumpang;
    }
}
