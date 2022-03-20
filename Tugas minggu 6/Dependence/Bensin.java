package dependence1;

/**
 *
 * @author Maolana
 */
public class Bensin {
    private jenisBensin bensin;
    
    public void setBensin (jenisBensin bensin){
        this.bensin = bensin;
    }
    
    public void pakaiBensin(){
        this.bensin.pakaiBensin();
    }
}
