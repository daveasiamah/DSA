import java.util.HashMap;

public class TwoSumOptimized {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> compliments = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer complimentIndex = compliments.get(nums[i]);
            if(complimentIndex != null){
                return new int[]{i,complimentIndex};
            }
            compliments.put(target - nums[i], i);
            System.out.println(compliments.size());
        }
        return nums;
    }
}
