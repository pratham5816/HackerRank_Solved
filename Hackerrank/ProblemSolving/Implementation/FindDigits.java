package ProblemSolving.Implementation;

public class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
        int c = 0;

        String str = Integer.toString(n);

        for (char ch : str.toCharArray()) {
            int d = Character.getNumericValue(ch);

            if (d != 0 && n % d == 0) {
                c++;
            }
        }
        return c;

    }
}
