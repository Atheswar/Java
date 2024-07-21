import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
        int n = ar.size();
        int k = 3;
        System.out.println(divisibleSumPairs(n, k, ar));
    }
}
