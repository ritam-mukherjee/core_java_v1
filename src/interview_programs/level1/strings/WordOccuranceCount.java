package interview_programs.level1.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ritmukherjee on 12/4/2016.
 */
public class WordOccuranceCount {
    public void getWordOccuranceMap(String str){
        HashMap<String,Integer> wordCountMap= new HashMap<>();
        String arr[]=str.split(" ");
        System.out.println("The string array is :"+arr);
        for(String s:arr){
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {

            if(wordCountMap.get(arr[i])==null){
                wordCountMap.put(arr[i],1);
            }
            else{
                wordCountMap.put(arr[i],((Integer)wordCountMap.get(arr[i]))+1);
            }
        }
        System.out.println(wordCountMap);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The string:");
        String inputString=sc.nextLine();
        new WordOccuranceCount().getWordOccuranceMap(inputString);

    }
}
