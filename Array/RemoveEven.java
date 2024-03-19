public class RemoveEven {
    public static void main(String args[]) {
        System.out.println("=======");
        int[] arr = { 2, 4, 6, 7, 9 };
        int[] resultArr = removeEven(arr);
        printArr(resultArr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] removeEven(int[] arr) {
        int oddSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddSize++;
            }
        }
        int[] oddArr = new int[oddSize];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        return oddArr;
    }

}
