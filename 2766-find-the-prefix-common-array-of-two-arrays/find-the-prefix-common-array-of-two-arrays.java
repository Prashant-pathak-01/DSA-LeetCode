class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int res[] = new int[A.length];
        int prev = 0;
        for(int i=0; i<A.length; i++ ){
            if(set.contains(A[i])) prev++;
            set.add(A[i]);
            if(set.contains(B[i])) prev++;
            set.add(B[i]);
            res[i] = prev;
        }
        return res;
    }
}