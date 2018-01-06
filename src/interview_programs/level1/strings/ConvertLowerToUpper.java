package interview_programs.level1.strings;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ConvertLowerToUpper {

    public static void main(String[] args) {

        Function<Character,Character> convert=achar -> (char)((int)achar+32);

        Function<char[],Character[]> array_convert=characters -> {
            Character[] output=new Character[characters.length];
            for (int i = 0; i < characters.length; i++) {
                output[i] = (characters[i] >= 65 && characters[i] < 97)
                        ?convert.apply(characters[i])
                        : characters[i];
            }
            return output;
        };

        Consumer<String> stringConsumer=str ->
                Arrays.stream(array_convert.apply(str.toCharArray())).forEach(System.out::print);
        stringConsumer.accept("RAM IS A GOOD BOY");
        System.out.println("\n");
        stringConsumer.accept("Mahim is a bad boy");


    }
/*

//NORMAL APPROACH
    public static void toLowerCase(String a){

        for (int i = 0; i< a.length(); i++){

            char aChar = a.charAt(i);
            if (65 <= aChar && aChar<=90){
                aChar = (char)( (aChar + 32) );
            }
            System.out.print(a);
        }
    }*/
}
