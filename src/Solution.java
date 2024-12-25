import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

        public static List<List<String>> TwoSum(String[] strs) {
            HashMap<String, List<String>> anagrams = new HashMap<>();
            ArrayList<List<String>> ans = new ArrayList<>();

            for (int i =1;i<strs.length;i++) {
                char[] caract = strs[i].toCharArray();
                Arrays.sort(caract);
                String sorted_str = new String(caract);

                if (anagrams.containsKey(sorted_str)) {

                    anagrams.get(sorted_str).add(strs[i]);
                } else {
                    List<String> res = new ArrayList<>();
                    res.add(strs[i]);
                    anagrams.put(sorted_str,res);
                }

            }
            List<List<String>> vals = new ArrayList<>(anagrams.values());
            return vals;
        }


        public static void main(String[] args) { // Corrected "Main" to "main"
            String[] nums = {"act","pots","tops","cat","stop","hat"};
            System.out.println((TwoSum(nums)));
        }
    }
