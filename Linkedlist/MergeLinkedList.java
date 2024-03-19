public class MergeLinkedList {

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
        System.out.println("=====================");
        MergeLinkedList sll = new MergeLinkedList();
        sll.head = new ListNode(2);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(22);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();

        MergeLinkedList sll1 = new MergeLinkedList();
        sll1.head = new ListNode(1);
        ListNode second1 = new ListNode(6);
        ListNode third1 = new ListNode(8);
        ListNode fourth1 = new ListNode(12);
        ListNode fifth1 = new ListNode(20);
        sll1.head.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        fourth1.next = fifth1;
        sll1.display();

        sll.mergeList(sll.head, sll1.head);
        sll.display();
    }

    public ListNode mergeList(ListNode a, ListNode b) {
        return a;
    }

}
