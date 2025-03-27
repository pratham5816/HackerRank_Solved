package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < queries.size(); i++) {
            for (int x = 0; x < stringList.size(); x++) {
                if (String.valueOf(queries.get(i)).equals(stringList.get(x))) {
                    count++;
                }
            }
            result.add(count);
            count = 0;
        }

        return result;
    }

}
