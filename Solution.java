import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public static char mostFrequentChar(String s) {
      HashMap<String, Integer> map = new LinkedHashMap<>();

      // split string to single length strings.
      String[] letters = s.split("");
      for (String letter : letters) { // iterate through string, check if letter in map
        if (map.containsKey(letter)) 
          map.replace(letter, map.get(letter) + 1);
        else 
          map.put(letter, 1);
      }

      int[] max = {0};
      char[] res = new char[1];
      map.forEach((key, value) -> {
        if (value > max[0]) {
          max[0] = value;
          res[0] = key.charAt(0);
        }
      });
      
      return res[0];
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("eeevvv"));
    }

  }
