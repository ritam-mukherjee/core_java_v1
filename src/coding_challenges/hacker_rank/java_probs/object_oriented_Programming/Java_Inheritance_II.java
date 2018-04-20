package coding_challenges.hacker_rank.java_probs.object_oriented_Programming;

/**
 * Source   :   HackerRank
 * Link     :   https://www.hackerrank.com/challenges/java-inheritance-2/problem
 */
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }
}

public class Java_Inheritance_II {
    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is :" + a.getClass().getSuperclass().getName());

        System.out.println(a.add(10, 32) + " " + a.add(10, 10) + " " + a.add(10, 10) + "\n");
    }
}
