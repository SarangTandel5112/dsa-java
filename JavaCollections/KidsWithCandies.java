import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        KidsWithCandies kwc = new KidsWithCandies();
        List<Boolean> l = kwc.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);
        System.out.println(l);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
