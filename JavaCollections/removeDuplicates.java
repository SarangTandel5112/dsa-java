import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 4, 4 };
        int[] nums = { 1, 1, 2 };
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

}
