package javaBraces;

import java.util.Deque;
import java.util.LinkedList;

public class JavaBraces {

    public static boolean checkBrackets (String str) {
        //FIFO
        //LIFO
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                deque.add(ch);
            } else {
                if(deque.size() == 0 || deque.pollLast() != '(') {
                    return false;
                }
            }
        }

        return deque.size() == 0;
    }

    public static void main (String [] args) {
        //((())()())

        boolean result = checkBrackets("((())()())");
        System.out.println(result);


    }
}
