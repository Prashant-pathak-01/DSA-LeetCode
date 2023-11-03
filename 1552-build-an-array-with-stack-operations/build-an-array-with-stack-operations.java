class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i = 1;
        int k = 0;
        List<String> list = new ArrayList<>(); 
        while(i<=n){
            if(k<target.length && target[k]==i){
                list.add("Push");
                k++;
            } else if(k<target.length){
                list.add("Push");
                list.add("Pop");
            }
            
            i++;
        }
        return list;
    }
}