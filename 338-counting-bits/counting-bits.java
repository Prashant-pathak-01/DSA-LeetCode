class Solution {
    public int getbits(int n){
        String str = Integer.toBinaryString(n);
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1') count++;
        } 
        return count;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = getbits(i);
        }
        return arr;
    }
}