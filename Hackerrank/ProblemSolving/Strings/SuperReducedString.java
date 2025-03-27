package ProblemSolving.Strings;

public class SuperReducedString {
    public static String superReducedString(String s) {
        // Write your code here

        if (s.isEmpty()) {
            return "Empty String";
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }

        }

        return sb.toString().isEmpty() ? "Empty String" : sb.toString();

    }
}
