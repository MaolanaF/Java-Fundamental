package assosiation;

import java.util.*;
/**
 *
 * @author Maolana
 */
public class Main {

    public static void main(String[] args) {
        // Attributes
        SupirAngkot Supir1 = new SupirAngkot();
        Supir1.setNamaSupirAngkot("Supir Amri");
        
        Penumpang AT1 = new Penumpang();
        AT1.setAlamatPenumpang("Ujung berung");
        Penumpang AT2 = new Penumpang();
        AT2.setAlamatPenumpang("Cileunyi");
        Penumpang AT3 = new Penumpang();
        AT3.setAlamatPenumpang("CIbiru");
        
        List<Penumpang> empList = new ArrayList<Penumpang>();
        empList.add(AT1);
        empList.add(AT2);
        empList.add(AT3);
        
        Supir1.setAlamatTujuan(empList);
        
        System.out.println(Supir1.getAlamatTujuan() + 
                " merupakan nama alamat penumpang yang harus diantar oleh " + Supir1.getNamaSupirAngkot());
    }
}
