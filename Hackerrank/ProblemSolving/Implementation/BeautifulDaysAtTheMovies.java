package ProblemSolving.Implementation;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int reverseDigit;
        int count = 0;
        for (int z = i; z <= j; z++) {
            reverseDigit = 0;
            reverseDigit = reverseint(z);
            if (Math.abs(z - reverseDigit) % k == 0) {
                count++;
            }
        }
        return count;

    }

    public static int reverseint(int s) {
        int r = 0;
        while (s != 0) {
            int digit = s % 10;
            r = r * 10 + digit;
            s /= 10;
        }

        return r;
    }

}
