class Solution {
    public int myAtoi(String s) {
        if (s==null || s.isEmpty()){
            return 0;
        }
        int l = s.length();
        int i=0;
        while(i<l && s.charAt(i)==' '){
            i++;
        }
        if(i==l){
            return 0;
        }
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        int thresh = Integer.MAX_VALUE/10;
        int res = 0;
        while(i<l){
            char c = s.charAt(i);
            if (c<'0' || c>'9'){
                break;
            }
            if(res>thresh || (res==thresh && c>'7')){
                return sign>0? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10 + (c-'0');
            i++;
        }
        return sign*res;
        
    }
}
