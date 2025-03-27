package ProblemSolving.Implementation;

public class UtopianTree {
    public static int utopianTree(int n) {
        // Write your code here
        int h = 1;
        for (int i = 1; i <= n; i++) {
            if (h % 2 == 0) {
                h = h + 1;
            } else {
                h = h * 2;
            }

        }
        return h;
    }
}
