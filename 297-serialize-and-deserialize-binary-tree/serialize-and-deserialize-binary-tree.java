public class Codec {
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        if(root==null ) return "";
        q.add(root);
        res.append(root.val+" ");
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                TreeNode temp = q.poll();
            if(temp.left!=null){
                q.add(temp.left);
                res.append(temp.left.val+" ");
            }else res.append("null ");

            if(temp.right!=null){
                    q.add(temp.right);
                    res.append(temp.right.val+" ");
                }else res.append("null ");
            }
        }
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        String arr[] = data.split(" ");
        if(arr[0].equals("null") || arr[0].equals("")) return null; 
        TreeNode res = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(res);
        int index = 1;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                TreeNode temp = q.poll();
                if(index<arr.length){
                    if(!arr[index].equals("null")){
                        temp.left = new TreeNode(Integer.parseInt(arr[index]));
                        q.add(temp.left);
                    }
                    index++;
                }
                if(index<arr.length){
                    if(!arr[index].equals("null")){
                        temp.right = new TreeNode(Integer.parseInt(arr[index]));
                        q.add(temp.right);
                    }
                    index++;
                }
            }
        }
        return res;
    }
}
