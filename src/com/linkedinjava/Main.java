package com.linkedinjava;
import com.linkedinjava.algorithms.*;
import com.linkedinjava.algorithms.dataStructures.LinkedList;
import com.linkedinjava.algorithms.dataStructures.LinkedListNode;

public class Main {

    public static void main(String[] args) {
	// GCD
        System.out.println(GCD.gcd(18,24));

    //LinkedListDemo
        LinkedList linkedList = new LinkedList(7);
        for(int i=5; i>=1; i--){
            LinkedListNode node = new LinkedListNode(i);
            linkedList.add(node);
        }
        LinkedListNode newNode = new LinkedListNode(6);
        linkedList.addAtIndex(newNode, linkedList.getCount());
        System.out.println(linkedList.toString());
        linkedList.reverse();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.find(newNode));
        System.out.println(linkedList.find(2).toString());
        System.out.println(linkedList.delete(newNode).toString());
        System.out.println(linkedList.toString());

    }
}
