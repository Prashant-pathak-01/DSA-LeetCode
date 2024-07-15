class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list=new ArrayList<>();
        boolean[] ans=prime(n+1);
        for(int i=2;i<=n/2;i++){
            if(!ans[i] && !ans[n-i]){
                list.add(new ArrayList<>(Arrays.asList(i,n-i)));
            }
        }
        return list;
    }

    public static boolean[] prime(int n) {
	    boolean[]arr=new boolean[n+1];
	    arr[0]=arr[1]=true;
	    for(int i=2;i<=Math.sqrt(arr.length);i++) {
		    if(!arr[i]) {
			    for(long k=(long)i*i;k<arr.length;k+=i) {
			    	arr[(int)k]=true;
		    	}
		}
	    }
	    return arr;
	}
}