class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        int x= 1;
        for(int i=0; i<pattern.length(); i++){
            int DCount =0;
            if(pattern.charAt(i)=='D'){
                while(i<pattern.length() && pattern.charAt(i)=='D') {
                    DCount++;
                    i++;
                }
                int temp = DCount;
                while(DCount>0){
                    res.append(x+DCount);
                    DCount--;
                }
                res.append(x);
                x+=temp;
            }else{
                res.append(x);
            }
            x++;
        }
        if(pattern.charAt(pattern.length()-1)=='I') res.append(x);
        return res.toString();
    }
}