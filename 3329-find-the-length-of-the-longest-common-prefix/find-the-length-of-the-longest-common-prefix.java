class Solution {
    
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int res = 0;
        Set<String> set = new HashSet<>(); 
        for(int i=0; i<arr1.length; i++){
            String x1 = String.valueOf(arr1[i]); 
            for(int j=0; j<x1.length(); j++){
                set.add(x1.substring(0,j+1));
            }
        }
        for(int i=0; i<arr2.length; i++){
            String x2 = String.valueOf(arr2[i]); 
            for(int j=0; j<x2.length(); j++){
                if(set.contains(x2.substring(0,j+1))) {
                    res = Math.max(res,x2.substring(0,j+1).length());
                }
            }
        }
        return res;
    }
}