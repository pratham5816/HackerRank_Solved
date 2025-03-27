package ProblemSolving.Strings;

import java.util.HashSet;

public class CamelCase {
    public static int camelcase(String s) {
        // Write your code here
        HashSet<Character> x = new HashSet<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            x.add(i);
        }
        int count = 1;
        for (char ch : s.toCharArray()) {
            if (x.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}
