class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            if(map.containsKey(str)){
                list.get(map.get(str)).add(strs[i]);
            }else {
                map.put(str,list.size());
                list.add(new ArrayList<>());
                list.get(list.size()-1).add(strs[i]);
            }
        }
        return list;
    }
}