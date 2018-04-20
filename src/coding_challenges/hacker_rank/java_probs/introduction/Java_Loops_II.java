package coding_challenges.hacker_rank.java_probs.introduction;
/**
Source  :   HackerRank
 Link   :   https://www.hackerrank.com/challenges/java-loops/problem
 */
import java.util.Scanner;
@FunctionalInterface
interface printSeries{
     void do_print_series(int a,int b,int n);
}


public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        printSeries printSeries=(a, b, n) -> {
            for (int i = 0; i <n ; i++) {
                int sum=0;
                for (int j = 0; j <=i ; j++) {
                    sum=sum+(int)Math.pow(2,j)*b;
                }
                sum=sum+a;
                System.out.print(sum + (i != n - 1 ? " " : "\n"));
            }
        };
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries.do_print_series(a,b,n);
        }
        in.close();


    }
}
