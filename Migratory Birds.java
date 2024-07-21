import java.util.List;
import java.util.Collections;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[6];
        for (int bird : arr) {
            count[bird]++;
        }
        int maxCount = 0;
        int mostFrequentBird = 0;
        for (int i = 1; i <= 5; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentBird = i;
            }
        }
        return mostFrequentBird;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 2, 2, 3);
        System.out.println(migratoryBirds(arr));
    }
}
