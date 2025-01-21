class Solution {
    public boolean doesValidArrayExist(int[] d) {
        int ans=0;
        for(int i=0; i<d.length; i++){
           ans=ans^d[i];
        }
       return ans==0;

    }
}