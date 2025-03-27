package ProblemSolving.Strings;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean hasNum = false;
        boolean haslow = false;
        boolean hasupp = false;
        boolean hasspe = false;

        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) >= 0) {
                hasNum = true;
            } else if (lower_case.indexOf(c) >= 0) {
                haslow = true;
            } else if (upper_case.indexOf(c) >= 0) {
                hasupp = true;
            } else if (special_characters.indexOf(c) >= 0) {
                hasspe = true;
            }
        }

        int numschar = 0;
        if (!hasNum)
            numschar++;
        if (!haslow)
            numschar++;
        if (!hasupp)
            numschar++;
        if (!hasspe)
            numschar++;

        int minlen = 6;
        int currentlen = password.length();

        return Math.max(numschar, minlen - currentlen);
    }
}
