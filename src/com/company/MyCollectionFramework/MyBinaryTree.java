package com.company.MyCollectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MyBinaryTree {
    static List<Integer> l=new ArrayList<>();

     static class Node{
        Node right;
        Node left;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
    public  Node createNode(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.println("enter data: ");
        int data=sc.nextInt();
        if(data==-1) return null;
        root= new Node(data);
        System.out.println("enter left node of "+ data);
        root.left=createNode();
        System.out.println("enter right node of "+ data);
        root.right=createNode();
        return root;
    }
    public  void inOrder(Node root)
    {
        if(root==null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    } public  void preOrder(Node root)
    {
        if(root==null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    } public  void postOrder(Node root)
    {
        if(root==null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int sizeLeft=size(node.left);
        int sizeRight=size(node.right);
        int total=sizeLeft+sizeRight+1;
        return total;
    }
    public int sum(Node node){
        if(node==null){
            return 0;
        }
        int Left=sum(node.left);
        int Right=sum(node.right);
        return Left+Right+ node.data;
    }
    public int height(Node node){
        if(node==null){
        return 0;
        }
        int lHeight=height(node.left);
        int rHeight=height(node.right);
        return (1+ Math.max(lHeight,rHeight));
    }
    public int max(Node node){
        if(node==null){
            return 0;
        }
        int l=max(node.left);
        int r=max(node.right);
        return Math.max(node.data,Math.max(l,r));
    }
    public void levelOrder(Node node){
        if(node==null){
            return;
        }

        System.out.println(node.data);
        levelOrder(node.left);
        

        levelOrder(node.right);
    }
    public void iteratePreOrder(Node node){
        Stack<Node> s=new Stack();
        s.push(node);
        while(!s.empty()){
            Node current= s.pop();
            System.out.println(current.data);
            if(current.left!=null){
                s.push(current.left);
            }
            if(current.right!=null){
                s.push(current.right);
            }
        }
        }
    }

