package com.company.MyCollectionFramework;

public class MyCircleQueue {
    int []arr;
    int capacity;
    int size;
    int rear;
    int front;

    public MyCircleQueue(int capacity)
    {
        this.capacity=capacity;
        arr=new int[capacity];
    }

    public void enQueue(int data)
    {
        if(size==capacity)
        {
            System.out.println("queue is full");
            return ;
        }
        arr[rear%(capacity)] =data;
        rear=(rear+1)%capacity;
        size++;

    }
    public int deQueue()
    {
        if(size==0)
        {
            System.out.println("queue is empty");
            return 0;
        }
        int temp=arr[front];
        front=(front+1)%capacity;
        size--;
        return temp;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i+front]);
        }
    }
}
