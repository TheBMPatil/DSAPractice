package LinkedListsLearning;

public class DLL {
    Node head;


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Printing in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.prev = last;
        last.next = node;
    }

    private Node get(int after) {
        Node temp = head;

        while (temp != null && temp.val != after) {
            temp = temp.next;
        }
        return temp;
    }

    void insertAfter(int after, int val) {
        Node curr = get(after);//Getting the reference of the node whre after we want insert the value
        Node temp = new Node(val);
        //If the DLL is empty
        if (curr == null) {
            System.out.println("value " + after + " Does Not Exist..!!");
            return;
        }
        //If the value we are inserting after the last node
        if (curr.next == null) {
            insertLast(val);
            return;
        }
        temp.next = curr.next;
        curr.next = temp;
        temp.prev = curr;
        temp.next.prev = temp;

    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
