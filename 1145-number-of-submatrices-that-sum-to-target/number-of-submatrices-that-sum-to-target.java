class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int arr[][] = new int[matrix.length][matrix[0].length+1];
        for(int i=0; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length+1; j++){
                arr[i][j] =arr[i][j-1]+matrix[i][j-1];
            }
        }
        int count =0 ;
        for(int i=0; i<matrix[0].length+1; i++){
            for(int j=i+1; j<matrix[0].length+1; j++){
                int sum = 0;
                Map<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
                for(int k=0; k<matrix.length; k++){
                    sum+=arr[k][j]-arr[k][i];
                    if(map.containsKey(sum-target)){
                        count+=map.get(sum-target);
                    }
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        return count;
    }
}