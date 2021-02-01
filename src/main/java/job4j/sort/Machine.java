package job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int refund = money - price;
        for (int coin : coins) {
            while (refund - coin >= 0) {
                refund -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}