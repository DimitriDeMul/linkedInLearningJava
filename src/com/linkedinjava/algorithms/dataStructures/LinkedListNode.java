package com.linkedinjava.algorithms.dataStructures;

public class LinkedListNode {
    private int val;
    private LinkedListNode next;

    public LinkedListNode(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return Integer.toString(this.val);
    }
}
