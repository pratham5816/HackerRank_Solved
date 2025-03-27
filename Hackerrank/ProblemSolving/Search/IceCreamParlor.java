package ProblemSolving.Search;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    x.add(i + 1);
                    x.add(j + 1);
                    return x;
                }
            }
        }

        return x;
    }
}
