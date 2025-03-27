package ProblemSolving.WarmUp;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
     public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
        int sum = 0;
        for(int i = 0; i < ar.size(); i++){
            sum += ar.get(i);
        }
        
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3); // {1,2,3} list <--
        System.out.println(simpleArraySum(arr));
    }

}
