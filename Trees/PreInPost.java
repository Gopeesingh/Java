package Trees;

import java.util.*;

public class PreInPost {
    public static void pip(int n){
        // base case
        if(n == 0) return;
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
    }
    public static class  Node{
        int val; //0
        Node left; //Null
        Node right; //Null

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
    public static void nthLevel2(Node root, int n){// left to right
        if(root == null) return;
        if(n == 1){
            System.out.print(root.val+" ");
        return;
        }
        nthLevel(root.right,n-1);
        nthLevel(root.left,-1);
        }
    // Preorder
    public static void preorder(Node root){
        // preorder is root left right
        if(root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    // Inorder
    public static void inorder(Node root){
        // inorder is  left root right
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    //  postorder
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    // BFS
    public static void bfs(Node root){ // Iterative way
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    root.left = a;
    root.right = b;
    Node c = new Node(4);
    Node d = new Node(5);
    a.left = c;
    a.right = d;
    Node e = new Node(6);
    Node f = new Node(7);
    b.left = f;
    b.right = e;
   // preorder(root);
   // inorder(root);
   // postorder(root);
    // bfs(root);
    int level = height(root) + 1;
    for(int i=1; i<=level; i++){
        if(i%2 != 0) nthLevel(root, i);
        else nthLevel2(root,i);
        System.out.println();
    }
    //System.out.println(height(root));
    }
}
