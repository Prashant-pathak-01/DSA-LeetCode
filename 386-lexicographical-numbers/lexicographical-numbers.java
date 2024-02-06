class Solution {
    public void generateAllLexi(int n, List<Integer> list, int sum, int i){
        if(sum>n) return;
        if(sum!=0) list.add(sum);
        for(int x=0; x<=9; x++){
            if(sum==0 && x==0) continue;
            generateAllLexi(n,list,sum*10+x,x);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        generateAllLexi(n,list,0,0);
        return list;
    }
}