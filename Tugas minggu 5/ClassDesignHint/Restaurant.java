package classhint;

/**
 *
 * @author Maolana
 */
public class Restaurant {
    // Instance variables 
    private menuMakanan[] IsiMenu;
    public static byte id = 0;
    // Accessor dan mutator
    public menuMakanan[] getIsiMenu() {
        return this.IsiMenu;
    }
    public void setDaftarMenu(menuMakanan[] IsiMenu) {
        this.IsiMenu = IsiMenu;
    }
    // Constructor
    public Restaurant() {
        this.IsiMenu = new menuMakanan[10];
        for( int i=0; i<10; i++) {
            this.IsiMenu[i] = new menuMakanan();
        }
    }
    // Behaviors / methods
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.IsiMenu[id].setNama_makanan(nama);
        this.IsiMenu[id].setHarga_makanan(harga);
        this.IsiMenu[id].setStok(stok);
    }
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(this.IsiMenu[i].getNama_makanan() +"["+this.IsiMenu[i].getStok()+"]"+"\tRp. "+this.IsiMenu[i].getHarga_makanan());
            }
        }
    }
    public boolean isOutOfStock(int id){
        if(this.IsiMenu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void nextId(){
        id++;
    }
    public void pemesananMakanan (String nama, int jumlahPesanan) {
        System.out.println("Untuk jenis pesanan: " + nama + " Sebanyak =  " + jumlahPesanan);

        updateStok(nama, jumlahPesanan);
    }
    public void updateStok (String nama, int jumlahPesanan) {
        int stok = 0;
        for( int i=0; i<10; i++) {
            if( nama.equals(this.IsiMenu[i].getNama_makanan()) ) {
                if(!isOutOfStock(i)){
                    stok = this.IsiMenu[i].getStok()-jumlahPesanan;
                    this.IsiMenu[i].setStok(stok);
                }
                else{
                    System.out.println("\nStok habis");
                }
            } 
        }
    }
}
