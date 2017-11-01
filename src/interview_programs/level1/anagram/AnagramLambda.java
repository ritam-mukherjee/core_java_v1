package interview_programs.level1.anagram;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by PouRit on 01-11-2017.
 */
public class AnagramLambda {
    public static void main(String[] args) {
        BiFunction<String,String,Boolean> checkAnagram=(word,anagram)->{
            boolean status=false;
           if(word.length()!=anagram.length())
               status=false;
            else {

               for (int i = word.length() % 2; i >= 0; --i) {
                   if (word.charAt(i) != anagram.charAt(anagram.length() - i - 1)) {
                      status=false;
                       break;
                   }
                   status=true;
               }

           }
            return status;
        };

        BiConsumer<String,String> printAnagramStatus=(word1,word2)->{
            System.out.println("Are the word "+word1+" and "+ word2+" anagram?");
            System.out.println(checkAnagram.apply(word1,word2));
        };

        printAnagramStatus.accept("ritam","matir");
        printAnagramStatus.accept("ritam","matira");

        printAnagramStatus.accept("ritam","astha");

    }
}
