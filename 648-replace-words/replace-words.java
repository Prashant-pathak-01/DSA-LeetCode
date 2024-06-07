class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String arr[] = sentence.split("\\s+");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<dictionary.size(); j++){
                if(arr[i].startsWith(dictionary.get(j))) {
                    arr[i] = dictionary.get(j);
                }
            }
        }
        return String.join(" ", arr);
    }
}