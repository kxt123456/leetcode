package subject;

import java.util.ArrayList;
import java.util.List;


public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<Integer> result =new ArrayList<>();
        helper(result,root);
        return result;

    }
    public  void helper(List result ,TreeNode root){
        if(root.left!=null){
            helper(result,root.left);
        }
        result.add(root.val);
        if(root.right!=null){
            helper(result,root.right);
        }
    }
}





