public class ReverseLinkedList {

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

    public void display(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("==========");
        ReverseLinkedList sll = new ReverseLinkedList();
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
        System.out.println("========reverse link list========");
        sll.reverse();
        sll.display();
    }

    public void reverse() {
        if (head != null) {

            ListNode current = head;
            ListNode nextNode = null;
            ListNode preNode = null;

            while (current != null) {
                nextNode = current.next;
                current.next = preNode;
                preNode = current;
                current = nextNode;
            }
            head = preNode;
        }

    }
}
