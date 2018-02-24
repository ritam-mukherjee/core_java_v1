package interview_programs.hacker_rank.dta_structure_probs.stacks;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Stack_Balanced_Brackets {

    static String isBalanced(String s) {
        // Complete this function

        Character[][] tokens = new Character[][]{{'(', ')'}, {'{', '}'}, {'[', ']'}};

        Predicate<Character> isOpenThread = character -> {
            for (Character[] charecters : tokens
                    ) {
                if (charecters[0] == character)
                    return true;
            }
            return false;
        };
                /*Arrays.stream(tokens).map(characters -> characters[0]).equals(character);*/

        BiPredicate<Character, Character> isMatches = (openterm, closeterm) -> {

            for (Character[] charecters : tokens
                    ) {
                if (charecters[0] == openterm)
                    return charecters[1] == closeterm;
            }
            return false;
        };

        Predicate<String> isbalanced = input -> {
            Stack<Character> stack = new Stack<>();
            for (Character c : input.toCharArray()) {
                if (isOpenThread.test(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || isMatches.test(stack.pop(), c) == false)
                        return false;
                }
            }
            return stack.isEmpty();
        };
        return isbalanced.test(s)?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

}
