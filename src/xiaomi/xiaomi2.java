package xiaomi;

import java.util.Scanner;

/**
 * Created by lk on 2016/9/23.
 */
public class xiaomi2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        if (n==1){
            System.out.print(0);
            return ;
        }
        TreeNode root =new TreeNode(in.nextInt());
        root.left=new TreeNode(in.nextInt());
        TreeNode current=root;


        for(int i =0;i<n-2;i++){
            int key=in.nextInt();
            int val=in.nextInt();
            if (key == current.val){
                if(current.left == null){
                    current.left=new TreeNode(val);
                }else {
                    current.right=new TreeNode(val);
                }
            }else {
                if (key == current.left.val){

                    current =current.left;
                    current.left=new TreeNode(val);
                }else{
                    current=current.right;
                    current.right=new TreeNode(val);
                }
            }

        }

        System.out.print(findDeep(root));

    }

    public static int findDeep(TreeNode root){

        if(root == null)
        {
            return 0;
        }
        else
        {
            int lchilddeep = findDeep(root.left);//求左子树的深度
            int rchilddeep = findDeep(root.left);//求右子树的深度
            return lchilddeep > rchilddeep ? lchilddeep + 1 : rchilddeep + 1;//左子树和右子树深度较大的那个加一等于整个树的深度
        }
    }



    static class TreeNode{
        int val=0;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;

        }
    }
}