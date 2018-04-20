package coding_challenges.hacker_rank.java_probs.data_structure;


/**
 * Source   :   HackerRank
 * Link     :   https://www.hackerrank.com/challenges/java-generics/problem
 * @param <T>
 */
class Printer<T>
{
    //Write your code here
    public void printArray(T[] elements){
        for (T t:elements
             ) {
            System.out.println(t);
        }
    }

}

public class Java_Generics {
    public static void main(String[] args) {

        Printer myPrinter=new Printer();
        String[] stringArray={"ritam","poulami","astha"};
        Integer[] intArray={1,2};
        myPrinter.printArray(stringArray);
        myPrinter.printArray(intArray);

    }
}
