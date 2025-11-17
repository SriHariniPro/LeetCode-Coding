class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> s = new HashSet<>();
      for(int n:nums){
        s.add(n);
      }
      int ml=0;
      for(int n:s){
        if(!s.contains(n-1)){
            int l =1;
            while(s.contains(n+l)){
                l++;
            }
        ml = Math.max(ml,l); 
        }
      }
      return ml;
      
    }
}
