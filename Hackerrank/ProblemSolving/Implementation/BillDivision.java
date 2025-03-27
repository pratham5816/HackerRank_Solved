package ProblemSolving.Implementation;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            sum += bill.get(i);
        }
        int CorrectAvg = (sum - bill.get(k)) / 2;
        if (CorrectAvg == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - CorrectAvg);
        }
    }
}
