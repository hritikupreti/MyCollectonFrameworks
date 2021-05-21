package com.company;
import com.company.MyCollectionFramework.*;
import com.sun.source.tree.BinaryTree;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static List<Integer> l=new ArrayList<>();

    public static void main(String[] args) throws Exception {
        l.add(12);
	// write your code here
       // MyLinkedList<Integer> Ll=new MyLinkedList<Integer>();
        //MyStack<Integer> MyS= new MyStack<Integer>();
        //StackArray<String> sa=new StackArray(4);
       // sa.push("fhdhd");
        //sa.push("oinsivs");
        //sa.push("aouefha");
        //String sr=sa.peek();v
       // System.out.println(sr);
       //sa.print();

        //MyCircleQueue q=new MyCircleQueue(5);
        //q.enQueue(0);
        //q.enQueue(1);q.enQueue(2);q.enQueue(3);q.enQueue(4);q.enQueue(5);
        //q.show();

       /* MyBinaryTree t= new MyBinaryTree();
        //MyBinaryTree.Node bt= createNode();
       // inOrder(bt);
        MyBinaryTree.Node root=t.createNode();
        int n=t.size(root);
        t.inOrder(root);
        System.out.println(n);*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        MyGraph graph=new MyGraph(v);
        System.out.println("enter all the edges");
        for(int i=0;i<e;i++)
        {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            graph.addAdjacent(source,destination);
        }*/
        //int num=graph.BFS(0,3);
        //System.out.println();
        //System.out.println("the shortest distance is "+num);



       // boolean bool=graph.DFS(0,1);
        //System.out.println(bool);


        MyBST bts=new MyBST();
        MyBST.Node root=null;
        root=bts.create(root,5);
        root=bts.create(root,3);root=bts.create(root,6);root=bts.create(root,4);
        MyBST.Node n=bts.parentNode(root,9);
        System.out.println(n);
    }
}
