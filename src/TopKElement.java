import java.util.*;

public class TopKElement {
    public static int[] TopKElement(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] res = new int[k];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for (int j=i;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if (!freq.containsKey(nums[i])) {
                freq.put(nums[i], count);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed()); // Descending order

        System.out.println("Sorted Frequency List: " + list);
        for(int z=0;z<k;z++){
            res[z]=list.get(z).getKey();
        }


        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,3,3,3,3,3,3,3,3};
        System.out.println(Arrays.toString(TopKElement(nums,2)));
        }

}