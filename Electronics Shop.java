public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int total = keyboard + drive;
                if (total <= b) {
                    maxSpent = Math.max(maxSpent, total);
                }
            }
        }
        return maxSpent;
    }

    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int b = 60;
        System.out.println(getMoneySpent(keyboards, drives, b));
    }
}
