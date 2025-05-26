class Solution {
    public int maxDiff(int num) {
        String str = String.valueOf(num);
        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();
        int maxIndex = -1;
        int minIndex = -1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='9'  && maxIndex==-1) maxIndex=i;
            if(str.charAt(i)!='1' && str.charAt(i)!='0'  && minIndex==-1) minIndex=i;
        }
        maxIndex = Math.max(maxIndex,0);
        minIndex = Math.max(minIndex,0);
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(maxIndex)) max.append('9');
            else max.append(str.charAt(i));
            if(str.charAt(i)==str.charAt(minIndex)) {
               if(minIndex==0) min.append('1');
               else min.append('0');
            }
            else min.append(str.charAt(i));
        } 
        return Integer.parseInt(max.toString())-Integer.parseInt(min.toString());
    }
}