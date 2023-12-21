package com.demo;

import java.util.Scanner;
import java.util.Stack;

public class demo09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        solution so = new solution();
        boolean output = so.isValid(input);
        System.out.println(output);


    }


    //没有用什么算法，主要是学到了，String里面的contains，replace和isEmpty
    //contains：包含里面的内容时才返回true
    //replace：逗号前是旧的，逗号后是新的
    //isEmpty:用来判断当里面是空的时候就返回true，否则返回false
//    static class Solution {
//        public boolean isValid(String s) {
//            while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
//                s = s.replace("[]","");
//                s = s.replace("{}","");
//                s = s.replace("()","");
//            }
//                return s.isEmpty();
//        }
//    }


    //法二：栈
    static class solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            int len = s.length();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.pop();
                    if ((left == '(' && c != ')') || (left == '[' && c!= ']' || left == '{' && c!= '}')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
