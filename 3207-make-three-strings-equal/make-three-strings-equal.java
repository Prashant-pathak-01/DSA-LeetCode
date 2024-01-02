class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if(s1.equals(s2) && s2.equals(s3)) return 0;
        int count = 0;
        for(int i=0; i<Math.min(s1.length(),Math.min(s2.length(),s3.length())); i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)) count++;
            else break;
        }
        if(count>=1){
            return s1.length()+s2.length()+s3.length()-(3*count);
        }
        return -1;
    }
}