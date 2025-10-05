//Solution 1
public void srtA(ArrayList<Integer> a,int n){
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a.get(m)==0){
                int t = a.get(l);
                a.set(l,a.get(m));
                a.set(m,t);
                l++;
                m++;
            }
            else if(a.get(m)==1){
                m++;
            }
            else{
                int t = a.get(h);
                a.set(h,a.get(m));
                a.set(m,t);
                h--;
            }
        }
    }
    public void sortColors(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i:nums){
            ar.add(i);
        }
        srtA(ar,nums.length);
        for(int i=0;i<nums.length;i++){
            nums[i]=ar.get(i);
        }
    }
//Solution 2 
class Solution {
    public void sortColors(int[] nums) {
        int w=0,r=0,b=0;
        for(int i:nums){
            if(i==0){
                r++; 
            }
            else if (i==1){
                w++;
            }
            else{
                b++;
            }
        }
        for(int i=0;i<r;i++){
            nums[i]=0;
        }
        for(int i=r;i<r+w;i++){
            nums[i]=1;
        }
        for(int i=r+w;i<r+w+b;i++){
            nums[i]=2;
        }
    }
}
