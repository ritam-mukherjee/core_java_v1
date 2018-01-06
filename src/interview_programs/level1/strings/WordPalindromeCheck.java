package interview_programs.level1.strings;

import java.util.function.Consumer;
import java.util.function.Function;

public class WordPalindromeCheck {

    public static void main(String[] args) {
        Function<String,Boolean> checkPalindrome=s -> {
            boolean isPalindrome=true;

            int mid=s.length()/2;
            char[] chars=s.toCharArray();
            while(mid<chars.length){


               if(chars[mid]!=chars[chars.length-(mid+1)]){
                   isPalindrome=false;
                   return isPalindrome;
               }
               mid++;
            }

            return isPalindrome;
        };

        Consumer<String> printConsumer=s -> System.out.println("The word  \'"+s +"\' is Palindrome? -"+checkPalindrome.apply(s));
        printConsumer.accept("maam");
        printConsumer.accept("madam");
        printConsumer.accept("matir");
    }
}
