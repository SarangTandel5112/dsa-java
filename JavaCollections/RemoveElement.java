import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 4, 4 };
        int[] nums = { 3, 2, 2, 3 };
        int value = 3;
        System.out.println(RemoveElement(nums, value));
        System.out.println(Arrays.toString(nums));
    }

    public static int RemoveElement(int[] nums, int value) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != value) {
                j++;
            } else if (nums[i] != value && nums[j] == value) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return ++j;
    }
}
