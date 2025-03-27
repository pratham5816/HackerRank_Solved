package ProblemSolving.Implementation;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int negcount = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) {
                negcount++;
            }
        }

        if (negcount < k) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
