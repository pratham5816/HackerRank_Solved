package ProblemSolving.Implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                int next5thMul = (((grades.get(i) / 5) * 5) + 5);
                if ((next5thMul - grades.get(i)) < 3) {
                    result.add(next5thMul);

                } else {
                    result.add(grades.get(i));

                }
            } else {
                result.add(grades.get(i));
            }
        }
        return result;
    }
}
