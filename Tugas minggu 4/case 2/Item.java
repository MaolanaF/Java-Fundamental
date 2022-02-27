package upinipin;

public class Item{
    private String name;
    
    private Item(){
        /*Constructor private digunakan untuk set name menjadi ipin*/
        name = "Ipin";
    } 
    
    public Item(String name){
        /*Constructor public yang akan dijalankan pada main*/
        this.name = new Item().name;/*mengisikan this.name dengan string name yang terdapat pada constructor private Item() yaitu ipin*/       
        System.out.println(this.name);
    }
}
