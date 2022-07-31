package com.Bridgelabz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        Linkedlist list = new Linkedlist();
        list.addFirst(56);
        list.addLast(70);
        list.insertInBetween(56,70,30);
        list.printList();
        list.findNode(30);
        list.insertElement(30,40);
        list.printList();
    }
}
