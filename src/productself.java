import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class productself {
    public static int[] product(int[] nums) {
        /*Brute Force
        nums = [1,2,4,6]
        int[] result = new int[nums.length];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0; i<nums.length;i++) {
            int prod = 1;
            for(int j=0; j<nums.length;j++) {
                if (j != i) {
                    prod = nums[j] * prod;
                }
            }
            result[i]=prod;
        }
        return result;
        */
        /*Optimized Way*/
        int[] result = new int[nums.length];
        int zero = 0;
        int max_prod = 1;
        for(int i =0;i<nums.length;i++){
            if (nums[i]==0) {
                zero = zero +1;
                if (zero>1) {
                    Arrays.fill(result,0);
                    return result;
                }
                continue;
            }

            else {
                max_prod = max_prod * nums[i];
            }
            System.out.println(zero);

        }
        System.out.println(zero);

        for(int j =0;j<nums.length;j++){
            if (nums[j]==0) {
                Arrays.fill(result,0);
                result[j] = max_prod;
                return result;
            }
            result[j] = max_prod / nums[j];
        }
        System.out.println(zero);
        return result;

    };
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(Arrays.toString(product(nums)));
    }
}
