class Solution {
    public int minFlips(String target) {
        int res= 0;
        boolean flag = true;
        for(int i=0; i<target.length(); i++){
            if(flag){
                if(target.charAt(i)!='0') {
                    res++;
                    flag = !flag;
                }
            }else{
                if(target.charAt(i)!='1') {
                    res++;
                    flag = !flag;
                }
            }
        }
        return res;
    }
}