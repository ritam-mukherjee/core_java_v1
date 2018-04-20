package coding_challenges.hacker_rank.tutorial.thirty_days_of_code.day_8;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Dictionaries_and_Maps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        ConcurrentHashMap<String,Integer> directory=new ConcurrentHashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            directory.putIfAbsent(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(directory.containsKey(s)?s+"="+directory.get(s):"Not Found");
        }
        in.close();
    }

}
