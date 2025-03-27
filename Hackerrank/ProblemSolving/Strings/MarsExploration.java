package ProblemSolving.Strings;

public class MarsExploration {
    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        String sos = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }
}
