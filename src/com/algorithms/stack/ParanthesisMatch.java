package com.algorithms.stack;

import java.util.Stack;

class ParanthesisMatch {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if(s==null || s.isEmpty()) {
            return true;
        }

        for(Character c : s.toCharArray()) {
            switch(c) {
                case '{':
                    stack.push('}');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if(!stack.isEmpty() && stack.pop() != c) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        System.out.println(new ParanthesisMatch().isValid("[()"));
    }
}
