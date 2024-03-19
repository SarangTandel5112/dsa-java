public class StackArray {

    private int[] arr;
    private int top;

    public StackArray(int capacity) {
        this.top = -1;
        this.arr = new int[capacity];
    }

    public StackArray() {
        this(10);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!!");
        }
        top++;
        arr[top] = value;

    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return top + 1;
    }

}
