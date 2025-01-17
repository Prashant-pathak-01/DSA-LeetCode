class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        boolean arr[] = new boolean[derived.length];
        for(int i=0; i<derived.length-1; i++){
            if(derived[i]==1){
                arr[i+1]= !arr[i];
            }else arr[i+1] = arr[i];
        }
        if(derived[derived.length-1]==0) return arr[arr.length-1]==arr[0];
        else return arr[arr.length-1]!=arr[0];

    }
}