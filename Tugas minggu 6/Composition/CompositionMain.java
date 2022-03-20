package composition;
import java.io.*;
import java.util.*;
/**
 *
 * @author Maolana
 */
public class Composition {

    public static void main(String[] args) {
        // TODO code application logic here
        Player p1 = new Player("Karim Benzema", "Center Forward");
        Player p2 = new Player("Toni Kroos", "Center Midfielder");
        Player p3 = new Player("David Alaba", "Center Back");
        Player p4 = new Player("Thibaut Courtois", "Goal Keeper");
        
        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        
        Club school = new Club(players);
        
        List<Player> pls = school.getTotalPlayersInClub();
        System.out.println("Daftar Pemain club Real Madrid:");
        for(Player pl : pls) {
            System.out.println("Name : " + pl.getName() + " dan " + "posisi : " + pl.getPosition());
        }
    }
    
}
