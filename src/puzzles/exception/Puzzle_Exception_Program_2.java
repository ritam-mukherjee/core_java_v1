package puzzles.exception;

/**
 * Created by ritmukherjee on 12/9/2016.
 */

import java.io.IOException;

class Father {
    public Father() throws IOException {
        System.out.println("Father class connstructor has called");
       // throw new IOException();
    }
}

class Son extends Father {
    public Son() throws IOException {
        System.out.println("Son class constructor has called");

    }
}

public class Puzzle_Exception_Program_2 {
    public static void main(String[] args) {
        try {
            new Son();
        } catch (IOException e) {
            System.out.print("Inside catch");
        }
    }
}
