package com.company.MyCollectionFramework;
public class StackArray<E>{
    E[] arr;
    int size;
    int top=-1;
    public StackArray(int size){
        this.size=size;
        arr= (E[]) new Object[size];
    }
        public void push(E element){
            if(top==size)
            {
                return;
            }
            top++;
            arr[top]=element;
        }
        public E pop(){
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        E temp=arr[top];
        top--;
        return  temp;
        }
        public E peek(){

        E temp=arr[top];
            return temp;
        }

        public void print(){
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        }
}


