package coding_challenges.hacker_rank.java_probs.string;

import java.util.*;

public class Java_Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i < s.toCharArray().length-k+1; i++) {
            list.add(s.substring(i,i+k));
        };

        Collections.sort(list,(s1, s2) -> s1.compareTo(s2));

        return list.get(0) + "\n" + list.get(list.size()-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
