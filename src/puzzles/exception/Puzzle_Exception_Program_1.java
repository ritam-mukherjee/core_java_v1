package puzzles.exception;

/**
 * Created by ritmukherjee on 12/8/2016.
 */
public class Puzzle_Exception_Program_1 {
    public void methodA(){
        try {
            System.out.println("@Method A->try()");
            throw new Exception();
        }catch (Exception e){
            System.out.println(  "@Method A->catch()");
        }finally {
            System.out.println(  "@Method A->finally()");
        }
    }
    public void methodB(){
        try {
            System.out.println("@Method B->try()");
            methodA();
            throw new Exception();
        }catch (Exception e){
            System.out.println(  "@Method B->catch()");
        }finally {
            System.out.println(  "@Method B->finally()");
        }
    }
    public void methodC(){
        try {
            System.out.println("@Method C->try()");
            methodB();
            throw new Exception();
        }catch (Exception e){
            System.out.println(  "@Method C->catch()");
        }finally {
            System.out.println(  "@Method C->finally()");
        }
    }

    public static void main(String[] args) {
        new Puzzle_Exception_Program_1().methodC();
    }
}
