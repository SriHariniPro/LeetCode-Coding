class Solution {

    public String encode(List<String> strs) {
        StringBuilder e = new StringBuilder();
        for (String s: strs){
            e.append(s.length()).append("#").append(s);
        }
        return e.toString();
    }

    public List<String> decode(String str) {
        List<String> d = new ArrayList<>();
        int c=0;
        int tl = str.length();
        while(c<tl){
            int di = str.indexOf("#",c);
            int l = Integer.parseInt(str.substring(c,di));
            int si = di+1;
            int ei = di+l+1;
            d.add(str.substring(si,ei));
            c = ei;
        }
        return d;
    }
}
