class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        // System.out.println(Arrays.toString(folder));
        List<String> list = new ArrayList<>();
        for(int i=folder.length-1; i>=0; i--){
            boolean flag = true;
            for(int j=i-1; j>=0; j--){
                if(folder[i].length()>folder[j].length() && folder[i].substring(0,folder[j].length()).equals(folder[j]) && folder[i].charAt(folder[j].length())=='/') {
                        flag = false;
                        break;
                }
            }
            if(flag) list.add(folder[i]);
        }
        return list;
    }
}