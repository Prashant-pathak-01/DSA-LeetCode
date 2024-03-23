class Solution {
    public List<String> twoEditWords(String[] a, String[] b) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                int temp= 0;
                for(int y=0,x=0; y<b[j].length(); x++,y++){
                    if(a[i].charAt(x)!=b[j].charAt(y)) temp++;
                }
                if(temp<=2){
                    list.add(a[i]);
                    break;
                }
            }
        }
        return list;
    }
}