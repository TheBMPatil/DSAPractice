package LinkedListsLearning;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = head;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }


        do {
            if (node.next.val == val) {
                node.next = node.next.next;
                return;
            } else {
                node = node.next;
            }

        } while (node != head);
        System.out.println("Value not in LL");
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty CLL");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }


    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
