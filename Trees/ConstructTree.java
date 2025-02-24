package Trees;

import java.util.*;
public class ConstructTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    // height
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
      // nthLevel traversal
      public static void nthLevel(Node root, int n){// left to right
        if(root == null) return;
        if(n == 1){
            System.out.print(root.val+" ");
        return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
        }
    public static Node constructbfs(String[] arr){
    int x = Integer.parseInt(arr[0]);
    int n = arr.length;
    Node root = new Node(x);
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int i = 1;
    while(i<n-1){
    Node temp = q.remove();
    Node left = new Node(0);
    Node right = new Node(0);
    if(arr[i].equals("")){
        left = null;
        }else{
            int l = Integer.parseInt(arr[i]);
            left.val = l;
            q.add(left);
        }
        if(arr[i+1].equals("")){
            right = null;
        }else{
            int r = Integer.parseInt(arr[i+1]);
            right.val = r;
            q.add(right);
        }
        temp.left = left;
        temp.right = right;
        i += 2;
    }
    return root;
    }
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        Node root = constructbfs(arr);
        // int level = height(root) + 1;
        // for(int i=1; i<=level; i++){
        //    nthLevel(root, i);
        //    System.out.println();
        // }
        boundaryDisplay(root);
    }
    public static void boundaryDisplay(Node root){
        LeftBoundary(root);
        BottomBoundary(root);
        RightBoundary(root.right);
    }
    public static void RightBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.val+" ");
    }
    public static void BottomBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            System.out.print(root.val+" ");
            return;
        }
        BottomBoundary(root.left);
        BottomBoundary(root.right);
    }
    public static void LeftBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        System.out.print(root.val+" ");
        if(root.left != null) LeftBoundary(root.left);
        else LeftBoundary(root.right);

    }
}
