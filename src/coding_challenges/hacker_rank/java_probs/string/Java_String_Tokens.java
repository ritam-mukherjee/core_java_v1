package coding_challenges.hacker_rank.java_probs.string;

import java.util.Arrays;

public class Java_String_Tokens {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();*/
        String s="He is a very very good boy, isn't he?";

        Arrays.stream(s.split("!|,|.|_|'|@")).forEach(System.out::println);

        System.out.println(s.split("!|,|.|_|'|@"));
        Arrays.stream(s.replaceAll("!|,|.|_|'|@"," ").split(" ")).forEach(System.out::println);


    }
}
