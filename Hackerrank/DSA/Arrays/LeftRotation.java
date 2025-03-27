package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> Result = new ArrayList<>();
        Result.addAll(arr.subList(d, arr.size()));
        Result.addAll(arr.subList(0, d));
        return Result;
    }
}
