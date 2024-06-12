class Solution {
    public List<List<Integer>> generate(int n) {
        if(n==0) return new ArrayList<>();
        if(n==1) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(Arrays.asList(1));
            return list;
        }
        List<List<Integer>> list = generate(n-1);
        List<Integer> prev = list.get(list.size()-1);
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        for(int i=1; i<n-1; i++){
            newList.add(prev.get(i-1)+prev.get(i));
        }
        newList.add(1);
        list.add(new ArrayList<>(newList));
        return list;
    }
}