package com.company.MyCollectionFramework;

public class MyLinkedList<E> {
    node<E> head;
    public void add(E e)
    {
        node<E> toAdd =new node<E>(e);
        if(head==null)
        {
            head=toAdd;
            return;
        }
        node<E> temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=toAdd;
    }
   public  void pushAt(int index, E data)
    {
        node<E> toAdd= new node<E>(data);
        node<E> temp=head;
        if(head==null)
        {
            System.out.println("linkedList is empty");
        }
        int len=length();
        if(index>=len){
            System.out.println("index not found");
            return;
        }
        if(index==len){
            add(data);
        }
        int count=0;
        node<E> previous=null;
        while(temp!=null )
        {
            if(count==index)
            {
                toAdd.next=temp;
                assert previous != null;                  //if  previous is null it give AssertionError.
                 previous.next=toAdd;
                return;
            }
            count++;
            previous=temp;
            temp=temp.next;
        }
    }
    public void Remove(E DataToBeDeleted)
    {
        node<E> temp=head;
        if(head==null)
        {
            System.out.println("Your LinkedList is already empty");
        }
        if(temp.next!=null && temp.data==DataToBeDeleted)
        {
            head=temp.next;
            return;
        }
        node<E> previous = null;
        while (temp != null && temp.data != DataToBeDeleted)
        {
            previous=temp;
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("no data found please enter again");
        }
        else {
            assert previous != null;
            previous.next = temp.next;
        }
    }
    // created this function mainly for MyStack class.
    public E deleteLast()throws Exception{
        node<E> temp=head;
        if(head==null){
           throw new Exception("empty list");
        }
        else if(temp.next==null){
            head=null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        node<E> ToBeDeleted=temp.next;
        temp.next=null;
        return ToBeDeleted.data;
    }
    // created this function mainly for MyStack class.
    public E peek()throws Exception{
        node<E> temp=head;
        if(head==null){
            throw new Exception("empty list peak function function dose not work");
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    // created this function mainly for MyStack class.
    public void isempty(){
        if(head==null){
            System.out.println("yes, list is empty");
        }
        else{
            System.out.println("no, list is not empty");
        }
    }
    public void deleteAll(){
        head=null;
    }
    public int  length(){
        node<E> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
       return count;
    }
    public void print()
    {
        node<E> temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
    static class node<E>{
        E data;
        node<E> next;
        public node(E data)
        {
            this.data=data;
            next=null;
        }
    }
}
