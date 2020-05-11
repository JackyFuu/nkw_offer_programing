package part1_1_10;



/**
 * @author jacky
 * @time 2020-04-30 12:33
 * @discription 树:
 *              输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *              假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *              例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 *              Solution:
 *              分出了左右子树之后再分别对左右两边采用递归。
 */
public class Question_4 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root = new TreeNode(pre[0]);

        int len = pre.length;
        //当只有一个数的时候(边界条件)
        if (len == 1){
            root.left = null;
            root.right = null;
            return  root;
        }


        //找到中序中的位置
        int rootVal = root.val;
        int i;
        for (i=0; i<len; i++){
            if (rootVal == in[i]);
                break;
        }
        //创建左子树
        if (i>0){
            int[] preL = new int[i];//现在的前序遍历序列数组
            int[] inL = new int[i]; //现在的中序遍历序列数组
            //将原前序遍历序列左子树（除去根节点）存入现在的前序遍历序列数组
            for (int j=0; j<i; j++){
                preL[j] = pre[j+1];
            }
            //将原中序遍历序列左子树（除去根节点）存入现在的中序遍历序列数组
            for (int j=0; j<i; j++){
                inL[j] = in[j];
            }
            root.left = reConstructBinaryTree(preL, inL);
        }else {
            root.left = null;
        }

        //创建右子树
        if (len-i-1>0){
            int[] preR = new int[len-i-1];
            int[] inR = new int[len-i-1];
            for (int j=i+1; j<len; j++){
                inR[j-i-1]=in[j];
                preR[j-i-1]=pre[j];
            }
            root.right=reConstructBinaryTree(preR, inR);
        }else {
            root.right=null;
        }
        return root;
    }

     //Definition for binary tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
