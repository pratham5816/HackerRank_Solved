package ProblemSolving.WarmUp;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = 0;

        long max = 0;

        Collections.sort(arr);

        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
        }

        for (int i = arr.size() - 1; i > 0; i--) {
            max += arr.get(i);
        }
        System.out.println(min + " " + max);

    }
}
