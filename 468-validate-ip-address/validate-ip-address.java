class Solution {
    public boolean isValidDecimal(String str){
        if(str.length()>=4 || str.length()==0) return false;
        //System.out.println(str.length());
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) return false;
        }
        if(Integer.parseInt(str)==0 && str.length()==1) return true;
        return str.charAt(0)!='0' && Integer.parseInt(str)<=255;
    }

    public boolean isValidHexa(String str){
        //System.out.println(str);
        if(str.length()>=5 || str.length()==0) return false;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('e');
        set.add('f');
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        set.add('F');
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i)) && !set.contains(str.charAt(i))) return false;
        }
        return true;
    }


    public String validIPAddress(String queryIP) {
        boolean check4 = false;
        boolean check6 = false;
        for(int i=0; i<queryIP.length(); i++) {
            if(queryIP.charAt(i)==':') check6 = true;
            else if(queryIP.charAt(i)=='.') check4 = true;

        }
        if(check4 && check6) return "Neither";
        else if(!check4 && !check6) return "Neither";
        if(check4){
            if(queryIP.charAt(queryIP.length()-1)=='.') return "Neither";
            String arr[] = queryIP.split("\\.");
            for(String str:arr){
                if(!isValidDecimal(str)) return "Neither";
            }
            return arr.length==4?"IPv4":"Neither";
        }else{
            if(queryIP.charAt(queryIP.length()-1)==':') return "Neither";
            String arr[] = queryIP.split("\\:");
            System.out.println(Arrays.toString(arr));
            for(String str:arr){
                if(!isValidHexa(str)) return "Neither";
            }
            return arr.length==8?"IPv6":"Neither";
        }

    }
}