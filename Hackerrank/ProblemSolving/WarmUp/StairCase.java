package ProblemSolving.WarmUp;

public class StairCase {
    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
