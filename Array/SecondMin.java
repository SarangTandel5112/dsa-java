public class SecondMin {
    public static void main(String[] args) {
        System.out.println(findSecondMin(new int[] { 3, 4, 56, 12, 40, 5 }));
    }

    public static int findSecondMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
