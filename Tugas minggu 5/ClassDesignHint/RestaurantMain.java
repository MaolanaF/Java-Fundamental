package classhint;

/**
 *
 * @author Maolana
 */
public class RestaurantMain {
    
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println();
        menu.pemesananMakanan("Bala-Bala", 7);
        menu.pemesananMakanan("Gehu", 5);
        menu.pemesananMakanan("Molen", 9);
        System.out.println();
        System.out.println("Update Stok Makanan");
        menu.tampilMenuMakanan();
    }
}
