package interview_programs.hacker_rank.java_probs.data_structure;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Source   :   HackerRank
 * Url      :   https://www.hackerrank.com/challenges/java-comparator/problem
 */
class Player{
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score < p2.score)
            return +1;
        if (p1.score> p2.score)
            return -1;
        if (p1.score == p2.score)
            return p1.name.compareTo(p2.name);
        if (p1.name.equalsIgnoreCase(p2.name))
                return 0;
        else
            return 0;

    }
}

public class Java_Comparator {
    public static void main(String[] args) {
        Player[] players=new Player[]{

                new Player("aleksa", 150),
                new Player("amy",  100),
                new Player("david",  100),
                new Player("aakansha",  75),
                new Player("heraldo",  50)
        };

        Arrays.sort(players,new Checker());

        for (Player player:players
             ) {
            System.out.println(player);
        }
    }
}
