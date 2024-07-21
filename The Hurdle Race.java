import java.util.List;

public class HurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int max_height = 0;
        for (int h : height) {
            if (h > max_height) {
                max_height = h;
            }
        }
        return Math.max(0, max_height - k);
    }

    public static void main(String[] args) {
        List<Integer> height = List.of(1, 6, 3, 5, 2);
        int k = 4;
        System.out.println(hurdleRace(k, height));
    }
}
