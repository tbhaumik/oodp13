package exercises;

import java.util.Stack;

public class PalindromeTester {
    private Stack<Character> stack;

    public PalindromeTester() {
        stack = new Stack<>();
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            stack.push(s.charAt(i));
        }
        String temp = "";
        for (int i = 0; i < len; i++) {
            temp = temp + stack.pop();
        }
        return s.equals(temp);
    }
}