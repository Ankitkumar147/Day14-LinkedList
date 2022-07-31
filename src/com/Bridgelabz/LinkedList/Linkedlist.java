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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList(){
        if (head == null ){
            System.out.println("List is Empty.!!!!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data +"-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void appendingNode(int before, int data) {
        Node currentNode = head;
        while (currentNode.data != before) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }

    public void insertInBetween(int before, int after, int data) {
        Node currentNode = head;
        while (currentNode.data != before && currentNode.data != after) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is Empty.");
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        Linkedlist list = new Linkedlist();
        list.addFirst(56);
        list.addLast(70);
        list.insertInBetween(56,70,30);
        list.printList();
        list.deleteFirst();
        list.printList();
    }
}
