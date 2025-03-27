package ProblemSolving.Implementation;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int Fturns = p / 2;
        int Eturns = (n / 2) - (p / 2);

        return Math.min(Fturns, Eturns);

    }
}
