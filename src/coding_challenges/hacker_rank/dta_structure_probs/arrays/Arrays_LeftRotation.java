package coding_challenges.hacker_rank.dta_structure_probs.arrays;

import java.util.Scanner;

public class Arrays_LeftRotation {
    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        while(d>0){
            int temp=a[0];

            for (int i = 1; i < a.length; i++) {
                a[i-1]=a[i];
            }
            a[a.length-1]=temp;
            d--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
