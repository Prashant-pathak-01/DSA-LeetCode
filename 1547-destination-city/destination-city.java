class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<paths.size(); i++){
            list.add(paths.get(i).get(0));
        }
        for(int i=0; i<paths.size(); i++){
            if(!list.contains(paths.get(i).get(1))) return paths.get(i).get(1);
        }
        return paths.get(0).get(0);
    }
}