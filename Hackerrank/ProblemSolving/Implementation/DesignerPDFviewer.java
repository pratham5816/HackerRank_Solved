package ProblemSolving.Implementation;

import java.util.List;

public class DesignerPDFviewer {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < height.size(); i++) {
            if (height.get(i) > max) {
                max = height.get(i);
            }
        }

        if (k > max) {
            return 0;
        } else {
            return (max - k);
        }
    }
}
