class Solution {
    public boolean isUnique(String temp){
        int arr[] = new int[26];
        for(int i=0; i<temp.length(); i++) {
            if(arr[temp.charAt(i)-'a']==1) return false;
            arr[temp.charAt(i)-'a']++;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        List<String> list = new ArrayList<>();
        int res = 0;
        list.add("");
        for(String str:arr){
            if(isUnique(str)){
                List<String> currList = new ArrayList<>();
                for(String temp:list){
                    if(isUnique(str+temp)){
                        currList.add(str+temp);
                        res = Math.max(res,str.length()+temp.length());
                    }
                }
                list.addAll(currList);
            }
        }
        return res;
    }
}