import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        ShuffleArray sf = new ShuffleArray();
        int[] arr = new int[] { 2, 5, 1, 3, 4, 7 };// [2,3,5,4,1,7]
        System.out.println(Arrays.toString(sf.shuffle(arr, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
