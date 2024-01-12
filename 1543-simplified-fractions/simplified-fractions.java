class Solution {
    public int exist(int i, int j){
        return i==0?j:exist(j%i,i);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(exist(i,j)!=1) continue;
                list.add(i+"/"+j);
            }
        }
        return list;
    }
}