package kelas;

public class KelasSatu {
    {
        System.out.println(11); /*akan ditampilkan ketika constructor KelasSatu dipanggil*/
    }
    
    static{
        System.out.println(2); /*akan ditampilkan satu kali di awal ketika constructor dipanggil*/
    }
    
    public KelasSatu(int i){
        System.out.println(3); /*akan ditampilkan ketika constructor KelasSatu dengan parameter dipanggil*/
    }
    
    public KelasSatu(){
        System.out.println(4); /*akan ditampilkan ketika constructor KelasSatu tanpa parameter dipanggil*/
    }
}
