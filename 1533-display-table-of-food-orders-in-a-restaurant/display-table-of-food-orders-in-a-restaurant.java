class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<String> dishes = new ArrayList<>();
        for(List<String> i:orders){
            if(!dishes.contains(i.get(2))){
                dishes.add(i.get(2));
            }
        }
        Collections.sort(dishes);
        Map<String,Integer> dishes_index = new HashMap<>();
        for(int i=0; i<dishes.size(); i++){
            dishes_index.put(dishes.get(i),i+1);
        }
        Map<Integer,String []> map = new HashMap<>();
        List<Integer> tableIndex = new ArrayList<>();
        for(List<String> i:orders){
            String[] list = map.getOrDefault(Integer.parseInt(i.get(1)),new String[dishes.size()+1]);
            if(list[0]==null){
                for(int x=1; x<list.length; x++) list[x] = "0";
                list[0] = i.get(1)+"";
            }
            list[dishes_index.get(i.get(2))] = String.valueOf(Integer.parseInt(list[dishes_index.get(i.get(2))])+1);
            map.put(Integer.valueOf(i.get(1)),list);
            if(!tableIndex.contains(Integer.valueOf(i.get(1)))) tableIndex.add(Integer.valueOf(i.get(1)));
        }
        List<List<String>> res = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        for(String key:dishes) header.add(key);
        res.add(header);
        Collections.sort(tableIndex);
        for(int key:tableIndex){
            res.add(Arrays.asList(map.get(key)));
        }
        return res;
    }
}