package ProblemSolving.Implementation;

import java.util.List;

public class AppleAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
            int appleCount = 0;
            int orangeCount = 0;
            
            for(int i = 0; i < apples.size(); i++){
                apples.set(i , apples.get(i) + a);
            }
            for(int j = 0; j < oranges.size(); j++){
                oranges.set(j, oranges.get(j) + b);
            }
            
            for(int x = 0; x < apples.size(); x++){
                if( apples.get(x) >= s && apples.get(x) <= t){
                    appleCount++;
                }
            }
            for(int x = 0; x < oranges.size(); x++){
                if( oranges.get(x) >= s && oranges.get(x) <= t){
                    orangeCount++;
                }
            }
            
            System.out.println(appleCount);
            System.out.println(orangeCount);
            
        }
}
