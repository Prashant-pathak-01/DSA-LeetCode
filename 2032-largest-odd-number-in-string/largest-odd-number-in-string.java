class Solution {
    public String largestOddNumber(String num) {
        int temp = 0;
        for(int i=0; i<num.length(); i++){
            if((num.charAt(i)-'0')%2!=0){
                temp = i+1;
            }
        }
        return num.substring(0,temp);
    }
}