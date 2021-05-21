package com.company.MyCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class MyGraph {
    LinkedList<Integer>[] adjacentNeighbor;

    public MyGraph(int v){
        adjacentNeighbor=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacentNeighbor[i]=new LinkedList<Integer>();
        }
    }
    public void addAdjacent(int source,int destination){
        adjacentNeighbor[source].add(destination);
        adjacentNeighbor[destination].add(source);
    }

    private boolean DFSInnerRun(int source,int destination,boolean checked[])
    {
        if(source==destination) return true;
        for (int neighbor:adjacentNeighbor[source]) {
            if(!checked[neighbor])
            {
                checked[neighbor]=true;
                boolean ifConnected=DFSInnerRun(neighbor,destination,checked);
                if(ifConnected) return true;
            }
        }
        return  false;
    }
    public boolean DFS(int source,int destination){
        boolean[] checked=new boolean[adjacentNeighbor.length];
        checked[source]=true;
        return DFSInnerRun(source,destination,checked);
    }


    public int BFS(int source,int destination){
     boolean[] checked=new boolean[adjacentNeighbor.length];
     int[] parent=new int[adjacentNeighbor.length];
     Queue<Integer> q=new LinkedList<>();
     q.add(source);
     checked[source]=true;
     parent[source]=-1;
     while(!q.isEmpty()){
         int cur= q.poll();
         if(cur==destination) break;
         for (int neighbor: adjacentNeighbor[cur]) {
             if(!checked[neighbor])
             {
                 checked[neighbor]=true;
                 q.add(neighbor);
                 parent[neighbor]=cur;
             }
         }
     }
     int cur= destination;
     int distance=0;
     while(parent[cur]!=-1){
         System.out.print(cur+"->");
         cur=parent[cur];
         distance++;
     }
        System.out.print(source);
     return distance;
    }


}
