import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int second_value = target - nums[i];
            if (values.containsKey(second_value)) {
                return new int[] {values.get(second_value),i};
            }
            values.put(nums[i],i);
        }
        return new int[] {};

    }


    public static void main(String[] args) { // Corrected "Main" to "main"
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(TwoSum(nums,7)));
    }
}
