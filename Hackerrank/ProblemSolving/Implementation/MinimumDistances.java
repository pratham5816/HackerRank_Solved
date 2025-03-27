package ProblemSolving.Implementation;

import java.util.HashMap;
import java.util.List;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                int d = i - map.get(a.get(i));
                min = Math.min(min, d);
            }

            map.put(a.get(i), i);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
