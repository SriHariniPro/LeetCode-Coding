class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> nu = new HashSet<>();
        for (int n:nums){
            if(!nu.add(n)){
                return true;
            }
        }
        return false; 
        
        //return Arrays.stream(nums).distinct().count() < nums.length ;

    }
}
