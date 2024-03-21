import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        arr.add(5, 7);
        System.out.println(arr);

        arr.addAll(1, arr);
        System.out.println(arr);

    }
}