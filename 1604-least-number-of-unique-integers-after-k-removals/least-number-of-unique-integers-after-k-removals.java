class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer> list  = new ArrayList<>(map.values());
        Collections.sort(list);
        int temp = 0;
        int i =0;
        for(i=0; i<list.size(); i++){
            temp+=list.get(i);
            if(temp==k) return list.size()-i-1;
            if(temp>k) return list.size()-i;

        }
        return 0;
    }
}