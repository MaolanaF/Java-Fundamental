package composition;
/**
 *
 * @author Maolana
 */
public class Player {
    // Attributes
    private String name;
    private String position;
    
    // Constructor
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getPosition(){
        return this.position;
    }
}
