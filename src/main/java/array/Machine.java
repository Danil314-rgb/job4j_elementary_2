package array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] result = new int[100];
        money = money - price;
        for (int indexCoins : coins) {
            while (money >= indexCoins) {
                money = money - indexCoins;
                result[size] = indexCoins;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
