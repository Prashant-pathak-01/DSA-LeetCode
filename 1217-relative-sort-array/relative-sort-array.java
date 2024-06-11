class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr1) map.put(i,map.getOrDefault(i,0)+1);
        int x = 0;
        for(int i=0; i<arr2.length; i++){
            int count = map.get(arr2[i]);
            map.remove(arr2[i]);
            for(int j=0; j<count; j++) arr1[x++] = arr2[i];
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<map.get(list.get(i)); j++ ){
                arr1[x++] = list.get(i);
            }
        }
        return arr1;


    }
}