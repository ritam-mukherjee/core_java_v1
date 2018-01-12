package interview_programs.hacker_rank.java_probs.object_oriented_Programming;

import java.util.Scanner;

/**
 * Source   :   HackerRank
 * Link     :   https://www.hackerrank.com/challenges/java-abstract-class/problem
 */
abstract class Book {
    String title;

    public abstract void setTitle(String title);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}

public class Java_Abstract_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("the title is    :" + new_novel.getTitle());
        sc.close();
    }
}
