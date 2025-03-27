package ProblemSolving.WarmUp;

import java.util.List;

public class DiagonalDiffrence {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diago1 = 0;
        int diago2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            diago1 += arr.get(i).get(i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            diago2 += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(diago1 - diago2);
    }
}
