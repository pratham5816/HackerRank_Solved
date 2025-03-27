package ProblemSolving.Implementation;

public class SherlocksAndSquares {
    public static int squares(int a, int b) {
        // Write your code here

        int s = (int) Math.ceil(Math.sqrt(a));
        int e = (int) Math.floor(Math.sqrt(b));
        return Math.max(0, e - s + 1);
    }
}