package interview_programs.level1.diagram;

import java.util.Scanner;
interface PyramidShapeLambda{
    public void printPyramidShape(int height);
}
public class PyramidShape {
   /* public void printPyramidShape(int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of pyramid:");
        int height=sc.nextInt();
        PyramidShapeLambda psl=(h)->{
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(j+" ");
                }
                for (int j = i; j >=1; j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        };

        psl.printPyramidShape(height);

    }
}
