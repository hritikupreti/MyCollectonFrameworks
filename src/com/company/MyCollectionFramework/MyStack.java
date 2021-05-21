package com.company.MyCollectionFramework;

public class MyStack<E> {
    MyLinkedList<E> ll=new MyLinkedList<E>();
    public void push(E e) throws Exception{
        ll.add(e);
    }
    public E pop() throws Exception {
        return ll.deleteLast();
    }
    public E peek()throws Exception{


       return ll.peek();
    }
    public void Empty(){
        ll.isempty();
    }
    public void print(){
        ll.print();
    }
    public int length(){
        return ll.length();
    }
}
