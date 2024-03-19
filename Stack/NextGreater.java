import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        NextGreater ng = new NextGreater();
        int[] arr = new int[] { 4, 7, 3, 4, 8, 1 };
        System.out.println(Arrays.toString(arr));
        int[] result = ng.nextGreater(arr);
        System.out.println(Arrays.toString(result));
    }

    public int[] nextGreater(int[] arr) {
        int[] newArr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!s.isEmpty()) {
                while (!s.isEmpty() && s.peek() < arr[i]) {
                    int a = s.pop();
                    System.out.println(a);
                }
            }
            if (s.isEmpty()) {
                newArr[i] = -1;
            } else {
                newArr[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return newArr;
    }
}
