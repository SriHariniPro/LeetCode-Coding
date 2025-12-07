class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> se = new HashSet<>();
        for(int n:nums){
            se.add(n);
        }
        int ml=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int n:nums){
            int cn=n;
            while(se.contains(cn)){
                se.remove(cn);
                cn++;
            }
            int sl = cn-n + m.getOrDefault(cn,0);
            m.put(n,sl);
            ml = Math.max(ml,m.get(n));
        }
        return ml;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> se = new HashSet<>();
        for(int n:nums){
            se.add(n);
        }
        int ml=0;
        for(int n:se){
            int cn = n;
            int c=1;
            if(!se.contains(cn-1)){
                while(se.contains(cn+1)){
                    c++;
                    cn++;
                }
            }
            ml = Math.max(ml,c);
        }
        return ml;
    }
}
