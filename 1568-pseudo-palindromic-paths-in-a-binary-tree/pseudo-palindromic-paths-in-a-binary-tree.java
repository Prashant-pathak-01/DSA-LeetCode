
class Solution {
    int count =0;
    int list[];
    public void checkPal(TreeNode root){
        if(root==null) return;
        list[root.val]++;
        if(root.left==null && root.right==null){
            if(checkList()) count++;
            list[root.val]--;
            return;
        }else{
            checkPal(root.left);
            checkPal(root.right);
        }
        list[root.val]--;
    }
    public boolean checkList(){
        int odd = 0;
        for(int i=0; i<list.length; i++) if(list[i]%2!=0) odd++;
        if(odd>1) return false;
        return true;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        list=  new int[10];
        checkPal(root);
        return count;
    }
}