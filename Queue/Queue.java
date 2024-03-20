
public class Queue {

    private ListNode front;
    private ListNode rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.endque(5);
        q.endque(10);
        q.endque(15);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
    }

    public int deque() {
        ListNode temp = front;
        if (front == null) {
            return -1;
        } else {
            front = front.next;
            temp.next = null;
            return temp.data;
        }
    }

    public void endque(int value) {
        ListNode temp = new ListNode(value);
        if (rear == null && front == null) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
    }

}