package ProblemSolving.Implementation;

import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        int[] colorCounts = new int[101];

        for (int color : ar) {
            colorCounts[color]++;
        }

        int pairs = 0;

        for (int count : colorCounts) {
            pairs += count / 2;
        }

        return pairs;
    }

}
