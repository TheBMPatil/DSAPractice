package LinkedListsLearning;

import java.util.SplittableRandom;

public class SLL {


    private Node head;
    private Node tail;
    private int size;

    //INSERT
    public void insertFirst(int val) {


        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index > size) {
            System.out.println("IndexOutOfBoundsException");
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node node = new Node(val, current.next);
        current.next = node;
        size++;
    }

    //DELETE
    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;


        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
//            temp.next = node;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public SLL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.next = next;
            this.val = val;
        }
    }

    //Remove Duplicates from sorted LL
    public void removeDups() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//Merge Sorted LL

    public static SLL mergeTwo(SLL first, SLL second) {
        Node f = first.head;
        Node s = second.head;
        SLL merged = new SLL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                merged.insertLast(f.val);
                f = f.next;
            } else {
                merged.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            merged.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            merged.insertLast(s.val);
            s = s.next;
        }


        return merged;
    }

    //Recursive bubble sort on linkedlist
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }


    public static void main(String[] args) {
        SLL first = new SLL();
        SLL second = new SLL();
        first.insertLast(13);
        first.insertLast(16);
        first.insertLast(10);
        first.insertLast(199);
        first.insertLast(15);

        second.insertLast(14);
        second.insertLast(18);
        second.insertLast(24);
        second.insertLast(74);

        first.display();
//        second.display();
        first.bubbleSort();
        first.display();

//        SLL ans = mergeTwo(first, second);

//        ans.display();

//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.display();
//        list.removeDups();
//        list.display();
    }


}
