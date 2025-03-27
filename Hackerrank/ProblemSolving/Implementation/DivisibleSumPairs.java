package ProblemSolving.Implementation;

import java.util.List;

public class DivisibleSumPairs {
     public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int count = 0;
      for(int i = 0; i < ar.size(); i++){
          for(int j = 1; j < ar.size(); j++){
              if(i < j && (ar.get(i) + ar.get(j)) % k == 0){
                  count++;
              }
          }
      }
      
      return count;
    }
}
