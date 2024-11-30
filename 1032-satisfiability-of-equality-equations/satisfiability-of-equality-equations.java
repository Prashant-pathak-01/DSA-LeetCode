class Solution {
    public boolean check(char i,char p, Map<Character,List<Character>> y, Map<Character,List<Character>> n, boolean visited[]){
        visited[i-'a'] = true;
        for(char key:y.get(i)){
            if(!visited[key-'a']){
                for(char x:n.get(key)) if(y.get(p).contains(x)) return false;
                boolean res = check(key,p,y,n,visited);
                if(!res) return res; 
            }
        }
        return true;
    }
    public boolean equationsPossible(String[] equations) {
        Map<Character,List<Character>> allowed = new HashMap<>();
        Map<Character,List<Character>> notAllowed = new HashMap<>();
        for(int i=0; i<equations.length; i++){
            char a = equations[i].charAt(0);
            char b = equations[i].charAt(3);
            boolean flag = equations[i].charAt(1)=='=';
            if(!allowed.containsKey(a)) allowed.put(a,new ArrayList<>());
            if(!notAllowed.containsKey(b)) allowed.put(b,new ArrayList<>());
            if(!notAllowed.containsKey(a)) notAllowed.put(a,new ArrayList<>());
            if(!notAllowed.containsKey(b)) notAllowed.put(b,new ArrayList<>());

            if(flag){
                if(notAllowed.get(a).contains(b) || notAllowed.get(b).contains(a)) return false;
                List<Character> list1 = allowed.get(a);
                list1.add(b);
                allowed.put(a,list1);
                List<Character> list2 = allowed.get(b);
                list2.add(a);
                allowed.put(b,list2);
            }else{
                if(a==b || allowed.get(a).contains(b) || allowed.get(b).contains(a)) return false;
                List<Character> list1 = notAllowed.get(a);
                list1.add(b);
                notAllowed.put(a,list1);
                List<Character> list2 = notAllowed.get(b);
                list2.add(a);
                notAllowed.put(b,list2);
            }
        }
        
       // System.out.println(allowed);
       // System.out.println(notAllowed);

        for(char key:allowed.keySet()){
            boolean res = check(key,key,allowed,notAllowed,new boolean[26]); 
            if(!res) return false;
        }
        return true;
    }
}