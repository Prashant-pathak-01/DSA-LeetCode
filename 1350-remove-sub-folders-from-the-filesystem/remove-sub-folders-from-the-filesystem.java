class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        res.add(folder[0]);
        for(int i=1; i<folder.length; i++){
            String next = res.get(res.size()-1)+"/";
            if(folder[i].length()>next.length() && folder[i].substring(0,next.length()).equals(next)) continue;
            res.add(folder[i]);
        }
        return res;
    }
}