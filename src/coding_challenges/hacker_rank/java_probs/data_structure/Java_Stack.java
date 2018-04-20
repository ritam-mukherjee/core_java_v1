package coding_challenges.hacker_rank.java_probs.data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input=sc.next();
            System.out.println(check(input));
            //Complete the code
        }
        sc.close();
    }

    public static boolean check(String input){
        char[] chars=input.toCharArray();
        if(chars.length%2!=0)
            return false;
        else {
            Stack<Character> stacks = new Stack<>();
            cyclic:
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(')
                    stacks.push('(');
                if (chars[i] == '{')
                    stacks.push('{');
                if (chars[i] == '[')
                    stacks.push('[');
                if (chars[i] == ')') {
                    if (stacks.isEmpty()||(!stacks.isEmpty()&&stacks.peek() == '('))
                        stacks.pop();
                    else
                        break cyclic;
                }
                if (chars[i] == '}') {
                    if (stacks.isEmpty()|| (!stacks.isEmpty()&&stacks.peek() == '{'))
                        stacks.pop();
                    else
                        break cyclic;
                }
                if (chars[i] == ']') {
                    if (stacks.isEmpty()|| (!stacks.isEmpty()&&stacks.peek() == '['))
                        stacks.pop();
                    else
                        break cyclic;
                }
                else
                    return false;

            }

            if (stacks.isEmpty())
                return true;
            else return false;
        }
    }
}
