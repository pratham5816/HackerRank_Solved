package ProblemSolving.Implementation;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int nums = 0;
        boolean inVal = false;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                level--;
            } else if (path.charAt(i) == 'U') {
                level++;
            }

            if (level < 0 && !inVal) {
                inVal = true;
            } else if (level >= 0 && inVal) {
                inVal = false;
                nums++;
            }
        }

        return nums;
    }
}
