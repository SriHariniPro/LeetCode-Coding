class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0;i<nums.length+1;i++){
            freq[i] = new ArrayList<>();
        }
        for (int n: nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : count.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }
        int[] res = new int[k];
        int ind = 0;
        for(int i = freq.length-1;i>0 && ind<k;i--){
            for(int f: freq[i]){
                res[ind++] = f;
                if (ind==k){
                    return res;
                }
            }
        }
        return res;

    }
}
