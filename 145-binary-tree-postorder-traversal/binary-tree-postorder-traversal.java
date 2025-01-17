class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        stack.add(root);
        while(!stack.isEmpty()){
            // System.out.println(stack.peek().val);
            if(stack.peek().left!=null){
                TreeNode temp = stack.peek().left;
                stack.peek().left=null;
                stack.add(temp);
            }else if(stack.peek().right!=null){
                TreeNode temp = stack.peek().right;
                stack.peek().right=null;
                stack.add(temp);
            }else{
                list.add(stack.pop().val);
            }
        }
        return list;
    }
}