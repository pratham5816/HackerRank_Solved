package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysDS {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> x = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            x.add(a.get(i));
        }
        return x;
    }

}
