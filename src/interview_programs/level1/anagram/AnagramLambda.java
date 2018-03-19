package interview_programs.level1.anagram;

import java.util.function.*;

/**
 * Created by PouRit on 01-11-2017.
 */
public class AnagramLambda {

    public static void main(String[] args) {
        Supplier<Integer> alphabets=() -> 26;
        Supplier<Integer> baseAscii=() -> (int)'a';
        Function<String,char[]> getCharCounter= s -> {

            char[] char_counter=new char[alphabets.get()];

            for (char c:s.toLowerCase().toCharArray()
                    ) {
                int offset=(int)c-baseAscii.get();
                char_counter[offset]++;
            }
            return char_counter;
        };


        BiFunction<char[],char[],Boolean> is_array_equal=(chars1, chars2) -> {
            boolean isEqual=true;
            BiPredicate<Character,Character> char_equal=(character1, character2) -> character1==character2;

            char_array_comparison:
            for (int i = 0; i < chars1.length; i++) {

                if(!char_equal.test(chars1[i],chars2[i])){
                    isEqual=false;
                    break char_array_comparison;

                }
            }
            return isEqual;
        };
        BiFunction<String,String,Boolean> checkAnagram=(s1, s2) -> {
            boolean isanagram=false;

            if(s1.length()!=s2.length())
                return isanagram;

            else if(s1.equalsIgnoreCase(s2)) {
                isanagram = true;
                return isanagram;
            }else {

                isanagram= is_array_equal.apply(getCharCounter.apply(s1),getCharCounter.apply(s2))?true:false;
            }
            return isanagram;
        };


        System.out.println(checkAnagram.apply("ritam","matin"));
    }
}
