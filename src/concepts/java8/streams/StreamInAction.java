package concepts.java8.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamInAction {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001b[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001b[37m";
    public static void main(String[] args) {

     //   Stream<String> name_stream=Stream.of("one","two","three","four","five","six","seven","eight","nine","zero");

        String[] number_array={"one","two","three","four","five","six","seven","eight","nine","zero"};

        System.out.print(ANSI_PURPLE+"===================STREAM OPERATIONS=====================");

        ArrayList<String> number_list=new ArrayList<String>(Arrays.asList(number_array));
        System.out.println(ANSI_RED+"\n------------Stream Operation over Collection-----------"+ANSI_RESET);
        number_list.stream().forEach(s -> System.out.print(s+","));

        System.out.println(ANSI_RED+"\n------------Stream Operation over Array-----------"+ANSI_RESET);
        Arrays.stream(number_array).forEach(s -> System.out.print(s+","));

        System.out.println(ANSI_BLUE+"\n------------Filter Operation Over Stream ArrayList-----------"+ANSI_RESET);
        number_list.stream().filter(s -> s.length()>3).forEach(s -> System.out.print(s+","));

        System.out.println(ANSI_BLUE+"\n------------Filter Operation Over Stream Array-----------"+ANSI_RESET);
        Arrays.stream(number_array).filter(s -> s.length()>3).forEach(s -> System.out.print(s+","));

        System.out.println(ANSI_BLUE+"\n------------Attaching Multiple Filter Over Stream ArrayList-----------"+ANSI_RESET);
        number_list.stream().filter(s -> s.length()>2).filter(s -> s.length()<5).forEach(s -> System.out.print(s+","));


        System.out.println(ANSI_BLUE+"\n------------Attaching Multiple Filter Over Stream Array-----------"+ANSI_RESET);
        Arrays.stream(number_array).filter(s -> s.length()>2).filter(s -> s.length()<5).forEach(s -> System.out.print(s+","));

        System.out.println(ANSI_GREEN+"\n------------Direct Stream declaration using OF method-----------"+ANSI_RESET);
        Stream<String> days_stream=Stream.of("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY");
        days_stream.forEach(s -> System.out.print(s.toLowerCase().substring(0,s.length()-3)+","));

        System.out.println(ANSI_GREEN+"\n------------Adding Array element to List-----------"+ANSI_RESET);
        ArrayList<String> list=new ArrayList<>();
        Arrays.stream(number_array).peek(s -> System.out.print(s+",")).filter(s->s.length()>3).forEach(list::add);
        System.out.println("SIZE IS:"+list.size());



    }
}
