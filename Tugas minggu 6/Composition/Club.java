package composition;

import java.util.*;
/**
 *
 * @author Maolana
 */
public class Club {
    private final List<Player> players;
    
    public Club(List<Player> players) {
        this.players = players;
    }
    
    public List<Player> getTotalPlayersInClub(){
        return players;
    }
}
