package barangandinventori;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; //modifier private digunakan agar stok tidak bisa di akses secara langsung dari luar class
      
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public int getStok() {
        return stok;
    }

    public void addStok(int stok) { 
        /*Method untuk operasi aritmatika penambahan pada stok*/
        this.stok += stok; 
    }
}
