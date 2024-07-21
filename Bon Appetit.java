import java.util.List;

public class BonAppetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalBill = 0;
        for (int cost : bill) {
            totalBill += cost;
        }
        int annaShare = (totalBill - bill.get(k)) / 2;
        if (b == annaShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
    }

    public static void main(String[] args) {
        List<Integer> bill = List.of(3, 10, 2, 9);
        int k = 1;
        int b = 12;
        bonAppetit(bill, k, b);
    }
}
