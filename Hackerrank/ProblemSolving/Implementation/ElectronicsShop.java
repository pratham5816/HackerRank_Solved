package ProblemSolving.Implementation;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int maxspent = -1;

        for (int keyP : keyboards) {
            for (int drivesP : drives) {
                int total = keyP + drivesP;

                if (total <= b && total > maxspent) {
                    maxspent = total;
                }
            }

        }
        return maxspent;

    }

}
