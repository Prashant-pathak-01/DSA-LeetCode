class Solution {
    public int countLatticePoints(int[][] circles) {
        Set<String> list = new HashSet<>();
        for(int i=0; i<circles.length; i++){
            int a = circles[i][0];
            int b = circles[i][1]; 
            int c = circles[i][2];
            for(int j=a-c; j<=a+c; j++){
                for(int k=b-c; k<=b+c; k++){
                    if((j-a)*(j-a)+(k-b)*(k-b)<=c*c) list.add(j+" "+k);
            }
                }
            }
        return list.size();
    }
}