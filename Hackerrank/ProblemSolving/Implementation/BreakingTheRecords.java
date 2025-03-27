package ProblemSolving.Implementation;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int leastScore = scores.get(0);
        int BrokeRecords = scores.get(0);
        int Lcount = 0;
        int Bcount = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > BrokeRecords) {
                BrokeRecords = scores.get(i);
                Bcount++;
            }
            if (scores.get(i) < leastScore) {
                leastScore = scores.get(i);
                Lcount++;
            }
        }

        List<Integer> R = new ArrayList<>();

        R.add(Bcount);
        R.add(Lcount);
        return R;

    }
}
