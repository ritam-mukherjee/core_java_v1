package coding_challenges.hackerearth.all_tracks.data_structures.arrays._1_d;

/**
Source  :   hackerearth
 link:  :   https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-the-earning-137963bc-323025a6/

 */
import java.util.Scanner;

public class Maximize_the_Earning {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int inputs=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <inputs ; i++){
            String[] rate_floor=sc.nextLine().split(" ");
            int building_count=Integer.parseInt(rate_floor[0]);
            int buildings[]=new int[building_count];
            for (int j = 0; j <buildings.length ; j++) {
                buildings[j]=sc.nextInt();
            }
            int count=1;
            int max_height=buildings[0];
            for (int j = 1; j <buildings.length ; j++) {
                if(buildings[j]>max_height){
                    count++;
                    max_height=buildings[j];
                }
            }

            System.out.println(count*Integer.parseInt(rate_floor[1]));
            if(sc.hasNextLine()) {
                sc.nextLine();
            }
        }

        sc.close();

    }
}
