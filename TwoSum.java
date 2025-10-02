public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h = new HashMap<>();
        int n = nums.length;
        for(int i =0; i<n;i++){
            if(h.containsKey(target-nums[i])){
                return new int[] {i,h.get(target - nums[i])};
            }
            else{
                h.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No solution!"); 
    }
}
