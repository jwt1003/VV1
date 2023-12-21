package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Solution solution = new Solution();
        int result = solution.romanToInt(input);
        System.out.println(result);
    }

      static class Solution {
        Map<Character, Integer> sym = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        public int romanToInt(String s) {
            int ans = 0;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                int value = sym.get(s.charAt(i));
                if (i < n - 1 && value < sym.get(s.charAt(i + 1))) {
                    ans = ans - value;
                } else {
                    ans = ans + value;
                }
            }
            return ans;
        }
    }
}
