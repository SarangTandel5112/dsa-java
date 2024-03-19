public class SinglyLinkedList {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("==========");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(8);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(22);
        ListNode fifth = new ListNode(5);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();
        System.out.println("=========insert first========");
        sll.insertFirst(25);
        sll.display();
        System.out.println("==========insert end=========");
        sll.insertLast(50);
        sll.display();
        System.out.println("==========insert at specific position=========");
        sll.insertElement(3, 20);
        sll.display();
        System.out.println("==========delete at start=========");
        sll.deleteStart();
        sll.display();
        System.out.println("==========delete at last=========");
        sll.deleteLast();
        sll.display();
        System.out.println("==========delete at position=========");
        sll.deleteElement(3);
        sll.display();
        System.out.println("==========Search element 2 in linked list=========");
        System.out.println(sll.searchElement(2));
    }

    public boolean searchElement(int key) {
        ListNode current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deleteElement(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            int count = 1;
            ListNode preNode = head;
            while (count != pos - 1) {
                preNode = preNode.next;
                count++;
            }
            ListNode current = preNode.next;
            preNode.next = current.next;
        }
    }

    public void deleteLast() {
        if (head != null) {
            ListNode current = head;
            ListNode previous = head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public void deleteStart() {
        if (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public void insertElement(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode preNode = head;
            int count = 1;
            while (count != position - 1) {
                preNode = preNode.next;
                count++;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

}
