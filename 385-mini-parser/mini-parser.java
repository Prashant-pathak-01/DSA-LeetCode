/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        if(s.charAt(0)!='[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        s = s.substring(1,s.length()-1);
        int count =0;
        int number = 0;
        boolean isNeg = false;
        int index = 0;
        NestedInteger res = new NestedInteger();
        boolean numExist = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='[') {
                if(count==0) index = i;
                count++;
            }
            else if(s.charAt(i)==']') {
                count--;
                if(count==0) res.add(deserialize(s.substring(index,i+1)));
            }
            else if(s.charAt(i)==','){
                if(count==0 && numExist){
                    res.add(new NestedInteger(number*(isNeg?-1:1)));
                    number =0;
                    numExist = false;
                }
                isNeg = false;
            }else if(Character.isDigit(s.charAt(i))){
                if(count==0){
                    number*=10;
                    number+=(s.charAt(i)-'0');
                    numExist = true;
                }
            }else if(s.charAt(i)=='-') isNeg = true;
        }
        if(count==0 && numExist){
            res.add(new NestedInteger(number*(isNeg?-1:1)));
        }
        return res;
    }
}