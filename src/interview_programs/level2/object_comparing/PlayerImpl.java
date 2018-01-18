package interview_programs.level2.object_comparing;
/**
 *
 * THIS IS A CLASSIC PROGRAM TO IMPLEMENT THE CONCEPT TAHT IF EQUALS METHOD OVERRIDE HASHCODE SHOULD OVERRIDE;
 * If we don't override HashCode method two cloned object java can't isolate
 *
 */

import java.util.HashSet;
import java.util.Set;

class Player {
    private String name;
    private int jerseyNumber;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Player p=(Player)obj;
        if(this.jerseyNumber==p.jerseyNumber && this.name.equalsIgnoreCase(p.name))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + jerseyNumber;
        return result;
    }
}
public class PlayerImpl {
    public static void main(String[] args) {
        Player dhoni=new Player("Dhoni",7);
        Player sachin=new Player("Sachin",10);

        Player sachin_clone=new Player("Sachin",10);

        Set<Player> playerSet=new HashSet<>();
        playerSet.add(dhoni);
        playerSet.add(sachin);
        playerSet.add(sachin_clone);
        System.out.println(playerSet);
    }


}
