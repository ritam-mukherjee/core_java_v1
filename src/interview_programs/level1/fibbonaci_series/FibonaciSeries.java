package interview_programs.level1.fibbonaci_series;

import java.util.Scanner;

/**
 * Created by PouRit on 18-11-2017.
 */


public class FibonaciSeries {
    StringBuffer sb=new StringBuffer();
    StringBuilder sl=new StringBuilder();
    public void getFibonacci(int count){
        int first=0;
        int second =1;
        sb.append(first).append(",").append(second).append(",");
        sl.append(first).append(",").append(second).append(",");

        getfibonacciByRecursion(count,first,second);
        System.out.println("with recursion Fibonacci output is  :  "+sb);

        getfibonacciWithoutRecursion(count,first,second);
        System.out.println("without recursion Fibonacci output is  :  "+sl);
    }

    public  void getfibonacciByRecursion(int count, int first, int second){

        if(count-2>0){
            int sum=first+second;
            sb.append(sum).append(",");
            first=second;
            second=sum;
            getfibonacciByRecursion(count - 1,first,second);
        }
    }

    public  void getfibonacciWithoutRecursion(int count, int first, int second){

        for (int i = 0; i < count-2; i++) {
            int sum=first+second;
            sl.append(sum).append(",");
            first=second;
            second=sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of no:");
        int length=sc.nextInt();
        if(length>2){
           new FibonaciSeries().getFibonacci(length);
        }
    }
}
