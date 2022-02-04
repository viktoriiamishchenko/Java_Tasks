package javaBraces;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class JavaManyBraces {


        private static Map<Character, Character> map;
        static {
            map = new HashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');
        }
        public static boolean checkBrackets (String str){

            Deque<Character> deque = new LinkedList<>();
            for (int i = 0; i < str.length(); i++) {
                Character closingBracket = str.charAt(i);
                Character openingBracket = map.get(closingBracket);
                if (openingBracket == null) {
                    deque.add(closingBracket);
                } else {
                    if (deque.size() == 0 || deque.pollLast() != openingBracket) {
                        return false;
                    }
                }
            }

            return deque.size() == 0;
        }


    public static void main (String [] args) {
        //((())()())

        boolean result = checkBrackets("{(())[]()()}");
        System.out.println(result);


    }
}
