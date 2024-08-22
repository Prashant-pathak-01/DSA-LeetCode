class Solution {
    public String arrangeWords(String text) {
        PriorityQueue<String []> pq = new PriorityQueue<>((a,b)->Integer.parseInt(a[2])!=Integer.parseInt(b[2])?Integer.parseInt(a[2])-Integer.parseInt(b[2]):Integer.parseInt(a[1])-Integer.parseInt(b[1]));
        int count = 0;
        int index =0 ;
        StringBuilder str = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==' '){
                pq.add(new String[]{str.toString(),index+"",str.toString().length()+""});
                index++;
                str.setLength(0);
            }else{
                str.append(text.charAt(i));
            }
        }
        pq.add(new String[]{str.toString(),index+"",str.toString().length()+""});
        str.setLength(0);
        while(!pq.isEmpty()){
            str.append(pq.poll()[0]+" ");
        }
        String res = str.toString();
        res = res.toLowerCase();
        res= (res.charAt(0)+"").toUpperCase()+res.substring(1,res.length()-1);
        return res;
    }
}