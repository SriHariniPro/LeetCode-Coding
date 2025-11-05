class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for (String s : strs){
            int[] co = new int[26];
            for (char i:s.toCharArray()){
                co[i-'a']++;
            }
            String k = Arrays.toString(co);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
