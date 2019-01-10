package com.linkedinjava.algorithms.dataStructures;

public class LinkedList {
    private LinkedListNode head;
    private int count;

    public LinkedList(int val) {
        this.head = createNode(val);
        this.count = 1;
    }

    public static LinkedListNode createNode(int val){
        return new LinkedListNode(val);
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(LinkedListNode node){
        node.setNext(this.getHead());
        this.setHead(node);
        this.setCount(this.count + 1);
    }

    public int addAtIndex(LinkedListNode node, int index){
        if(index > this.count+1){
            return -1;
        }
        else{
            LinkedListNode dummy = createNode(-1);
            dummy.setNext(this.head);
            while(dummy.getNext() != null && index > 1){
                dummy = dummy.getNext();
                index--;
            }
            if(dummy.getNext() == null){
                dummy.setNext(node);
            }
            else{
                node.setNext(dummy.getNext());
                dummy.setNext(node);
            }
        }
        this.setCount(this.count + 1);
        return this.count;
    }

    public LinkedListNode deleteAt(int index){
        LinkedListNode deletedNode;
        if(index > this.count){
            return null;
        }
        else if(index == 1){
            deletedNode = this.getHead();
            this.setHead(this.head.getNext());
        }
        else{
            LinkedListNode dummy = createNode(-1);
            dummy.setNext(this.head);
            while(dummy.getNext() != null && index > 1){
                dummy = dummy.getNext();
                index--;
            }
            deletedNode = dummy.getNext();
            dummy.setNext(dummy.getNext().getNext());
        }
        this.setCount(this.count - 1);
        return deletedNode;
    }

    public LinkedListNode delete(LinkedListNode node){
        int index = find(node);
        if(index == -1)
            return null;
        return deleteAt(index);
    }

    public int find(LinkedListNode node){
        LinkedListNode dummy = this.head;
        int index = 1;

        while(dummy != null){
            if(dummy.equals(node)){
                return index;
            }
            else{
                dummy = dummy.getNext();
                index++;
            }
        }
        return -1;
    }

    public LinkedListNode find(int index){
        if(index > this.count){
            return null;
        }
        else if(index == 1){
            return this.getHead();
        }
        else {
            LinkedListNode dummy = createNode(-1);
            dummy.setNext(this.head);
            while (dummy.getNext() != null && index > 1) {
                dummy = dummy.getNext();
                index--;
            }
            return dummy.getNext();
        }
    }

    public LinkedListNode reverse(){
        if(this.head == null || this.head.getNext() == null){
            return head;
        }
        LinkedListNode previous = null, current = this.head;
        while(current!= null){
            LinkedListNode next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        this.setHead(previous);
        return this.getHead();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        LinkedListNode dummy = this.getHead();
        if(this.getHead() == null){
            return sb.toString();
        }
        while(dummy != null){
            sb.append(dummy.getVal());
            sb.append("->");
            dummy = dummy.getNext();
        }
        return sb.toString();
    }
}


