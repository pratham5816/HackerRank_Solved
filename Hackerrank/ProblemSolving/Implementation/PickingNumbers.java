package ProblemSolving.Implementation;

public class PickingNumbers {
    static String catAndMouse(int x, int y, int z) {

        int dA = Math.abs(x - z);
        int dB = Math.abs(y - z);
        String result;
        if (dA < dB) {
            result = "Cat A";
        } else if (dB < dA) {
            result = "Cat B";
        } else {
            result = "Mouse C";
        }
        return result;

    }
}
