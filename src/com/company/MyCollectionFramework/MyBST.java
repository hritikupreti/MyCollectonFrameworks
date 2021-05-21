package com.company.MyCollectionFramework;

public class MyBST {
    MyBinaryTree myBinaryTree=new MyBinaryTree();
    public static class Node{
       public int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;

        }
    }
     Node insert(int data){
        Node node=new Node(data);
         node.left=null;
         node.right=null;
        return node;
    }
    public  Node create(Node node, int data){
        if(node==null){
            return insert(data);
        }
        if(data<node.data) node.left=create(node.left,data);
        else if(data>node.data) node.right=create(node.right,data);
        return node;
    }
    public Node delete(Node node, int DataToBeDeleted){
        if(node==null) return null;

        if(DataToBeDeleted<node.data) node.left=delete(node,DataToBeDeleted);
        else if(DataToBeDeleted>node.data) node .right=delete(node,DataToBeDeleted);
        else{
            if(node.left==null || node.right==null){
                Node temp=null;
                temp=node.left==null? node.right: node.left;
                if(temp==null) return null;
                else return temp;
            }
            else{
                Node successor= successor(node);
                node.data=successor.data;
                node.right=delete(node.right,successor.data);
                return node;
            }
        }
        return node;
    }
    public Node successor(Node node){
        if(node==null) return null;
        Node temp=node.right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;

    }
    public Node parentNode(Node node, int data){
        if(node==null|| node.left==null || node.right==null) return  null;
        Node preNode=null;
        if(data<node.data){
            if(node.left.data==data) return node;
            else preNode=parentNode(node.left, data);
        } else if(data>node.data){
            if(node.right.data==data) return node;
            else preNode=parentNode(node.right, data);
        }
        return  preNode;
    }

    public Node add(Node node ,int data){
        if(node==null){
            return insert(data);
        }
        if(data<node.data) node.left=add(node.left,data);
        else if(data>node.data) node.right=add(node.right,data);

        return  node;
    }
    public Node LCA(Node node, int data1, int data2){
        if(node==null) return  null;
        if( data1<node.data && data2<node.data){
            return LCA(node.left,data1,data2);
        }
        else if(data1>node.data && data2>node.data){
            return LCA(node.right,data1,data2);
        }
        else{
            return node;

        }
    }

}
