class Solution {
    public void generatelexi(int x, int n,List<Integer> list){
        if(x>n) return;
        if(x!=0) list.add(x);
        for(int i=0; i<=9; i++){
            if(x==0 && i==0) continue;
            generatelexi(x*10+i,n,list);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        generatelexi(0,n,list);
        return list;
    }
}