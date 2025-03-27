package ProblemSolving.WarmUp;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveCount = 0;
        int negetiveCount = 0;
        int zeros = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zeros++;
            } else if (arr.get(i) > 0) {
                positiveCount++;
            } else {
                negetiveCount++;
            }
        }
        int n = positiveCount + negetiveCount + zeros;
        double pos = (double) positiveCount / n;
        double neg = (double) negetiveCount / n;
        double zero = (double) zeros / n;

        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(pos));
        System.out.println(df.format(neg));
        System.out.println(df.format(zero));
    }
}