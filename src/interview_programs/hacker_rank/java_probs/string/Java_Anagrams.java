package interview_programs.hacker_rank.java_probs.string;

/**
 *  Source  :   Hacker Rank
 *  Link    :   https://www.hackerrank.com/challenges/java-string-tokens/problem
 */

import java.util.Scanner;

public class Java_Anagrams {


    static final int alphabet_counter=26;
    static final int baseAscii=(int)'a';
    static char[] getCharCounter(String s){

        char[] char_counter=new char[alphabet_counter];

        for (char c:s.toLowerCase().toCharArray()
                ) {
            int offset=(int)c-baseAscii;
            char_counter[offset]++;
        }
        return char_counter;
    }

    static Boolean is_array_equal(char[] chars1, char[] chars2) {
        boolean isEqual=true;


        char_array_comparison:
        for (int i = 0; i < chars1.length; i++) {

            if(!(chars1[i]==chars2[i])){
                isEqual=false;
                break char_array_comparison;

            }
        }
        return isEqual;
    }


    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        boolean isanagram=false;

        if(s1.length()!=s2.length())
            return isanagram;

        else if(s1.equalsIgnoreCase(s2)) {
            isanagram = true;
            return isanagram;
        }else {
            char[] chars1=getCharCounter(s1);
            char[] chars2=getCharCounter(s2);
            isanagram= is_array_equal(chars1,chars2);
        }
        return isanagram;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }


}
