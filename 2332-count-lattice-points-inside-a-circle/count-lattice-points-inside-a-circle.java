class Solution {
    public int countLatticePoints(int[][] circles) {
        Set<String> list = new HashSet<>();
        for(int i=0; i<circles.length; i++){
            int a = circles[i][0];
            int b = circles[i][1]; 
            
            for(int j=a-circles[i][2]; j<=a+circles[i][2]; j++){
                for(int k=b-circles[i][2]; k<=b+circles[i][2]; k++){
                    if((j-a)*(j-a)+(k-b)*(k-b)<=circles[i][2]*circles[i][2]) list.add(j+" "+k);
            }
                }
            }
        return list.size();
    }
}