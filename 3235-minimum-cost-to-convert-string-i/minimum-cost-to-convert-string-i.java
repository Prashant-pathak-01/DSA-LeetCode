class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long arr[][] = new long[26][26];
        for(int i=0; i<arr.length; i++){
            Arrays.fill(arr[i],Integer.MAX_VALUE);
            arr[i][i] = 0;
        }
        for(int i=0; i<original.length; i++){
            arr[original[i]-'a'][changed[i]-'a'] = Math.min(arr[original[i]-'a'][changed[i]-'a'],cost[i]);
        }
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<26;j++)
            {
                for(int k=0;k<26;k++)
                {
                    arr[j][k]=Math.min(arr[j][k],arr[j][i]+arr[i][k]);
                }
            }
        }
        
        long res = 0;
        for(int i=0; i<source.length(); i++){
            if(source.charAt(i)!=target.charAt(i)){
                if(source.charAt(i)==target.charAt(i)) continue;
                if(arr[source.charAt(i)-'a'][target.charAt(i)-'a']==Integer.MAX_VALUE) return -1;
                else res+=arr[source.charAt(i)-'a'][target.charAt(i)-'a'];
            }
        }
        return res;
    }
}