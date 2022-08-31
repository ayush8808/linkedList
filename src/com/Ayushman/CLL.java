package com.Ayushman;

import java.util.*;

    public class CLL {
        private Node head;

        public CLL() {
            this.head = null;
        }

        public void insertFirst(int val) {
            // creating a new node with the provided value
            Node node = new Node(val);
            // checking for the initial node is null or not
            if (this.head == null) {
                this.head = node;
            } else {
                node.nxt = head;
                this.head = node;
            }
        }

        public void insertLast(int val) {
            Node gd = new Node(val);
            Node temp = this.head;
            while (temp.nxt != null) {
                temp = temp.nxt;
            }
            // we have the last dabba's address
            temp.nxt = gd;
        }

        public void display() {
            // System.out.println(node.val)
            Node temp = this.head; // getting the starting pointer of ll

            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.nxt;// updating the next node
            }
            System.out.println("End");
        }

        public void evenLL() {
            Node temp = this.head;
            while (temp != null) {
                if (temp.val % 2 == 0)
                    System.out.print(temp.val + "->");
                temp = temp.nxt;// updation
            }
            System.out.println();
        }

        public void OddLL() {
            Node temp = this.head;
            while (temp != null) {
                if (temp.val % 2 != 0)
                    insertFirst(temp.val);
                // System.out.print(temp.val + "->");
                temp = temp.nxt;// updation
            }
        }

        public void deleteFirst() {
            this.head = head.nxt;
        }

        public void sortingAcending() {
            // defining two pointers to trivers the ll and applying
            // bubble sort
            Node i = this.head;
            Node j = this.head.nxt;
            for (; j != null;) {
                Node p = this.head;
                Node q = this.head.nxt;
                for (; p.nxt != null;) {
                    if (p.val > q.val) {
                        int temp = p.val;
                        p.val = q.val;
                        q.val = temp;
                    }
                    p = p.nxt;
                    q = q.nxt;
                }
                i = i.nxt;
                j = j.nxt;

            }
        }

        public void sortingDecsending() {
            // defining two pointers to trivers the ll and applying
            // bubble sort
            Node i = this.head;
            Node j = this.head.nxt;
            for (; j != null;) {
                // for(;j!=null;){}
                Node p = this.head;
                Node q = this.head.nxt;
                for (; p.nxt != null;) {
                    if (p.val < q.val) {
                        int temp = p.val;
                        p.val = q.val;
                        q.val = temp;
                    }
                    p = p.nxt;
                    q = q.nxt;
                }
                i = i.nxt;
                j = j.nxt;

            }
        }

        public void deleteLast() {
            Node temp = this.head;
            while (temp.nxt.nxt != null) {
                temp = temp.nxt;
            }
            temp.nxt = null;
        }

        // defining node data type

        private class Node {
            int val;
            Node nxt;

            public Node(int val) {
                this.val = val;
                this.nxt = null;
            }
        }
        public void emptyLL()
        {
            this.head=null;
        }
    }

