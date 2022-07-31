package com.Bridgelabz.LinkedList;

public class Linkedlist {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if (head == null ){
            System.out.println("List is Empty.!!!!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data +"--->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        Linkedlist list = new Linkedlist();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.printList();
    }
}
