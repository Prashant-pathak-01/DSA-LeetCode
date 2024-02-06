class Solution {
    public void generateSoln(List<String> list, String digit, int i, String res,String arr[]){
        if(res.length()==digit.length()){
            list.add(res);
            return;
        }
        for(int x=0; x<arr[digit.charAt(i)-'0'].length(); x++){
            generateSoln(list,digit,i+1,res+arr[digit.charAt(i)-'0'].charAt(x),arr);
        }
    }
    public List<String> letterCombinations(String digits) {
        String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        if(digits.length()==0) return list;
        generateSoln(list,digits,0,"",arr);
        return list;
    }
}