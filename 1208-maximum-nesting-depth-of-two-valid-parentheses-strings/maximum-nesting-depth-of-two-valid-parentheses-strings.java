class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int res[] = new int[s.length()];
        int max=  0;
        int temp = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') temp++;
            else temp--;
            max = Math.max(max,temp);
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                temp++;
                if(temp>max/2) res[i] = 1;
            }else{
                if(temp>max/2) res[i] = 1;
                temp--;
            }
        }
        return res;
    }
}