package ProblemSolving.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxf = 0;
        int smallestID = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int birdtype = entry.getKey();
            int fre = entry.getValue();
            if (fre > maxf || (fre == maxf && birdtype < smallestID)) {
                maxf = fre;
                smallestID = birdtype;
            }
        }

        return smallestID;
    }
}
